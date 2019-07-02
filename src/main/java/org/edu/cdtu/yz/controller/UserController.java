package org.edu.cdtu.yz.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.edu.cdtu.yz.bean.Path;
import org.edu.cdtu.yz.bean.User;
import org.edu.cdtu.yz.query.PageQuery;
import org.edu.cdtu.yz.service.IPathService;
import org.edu.cdtu.yz.service.IUserService;
import org.edu.cdtu.yz.util.AjaxResult;
import org.edu.cdtu.yz.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public IUserService userService;

    @Autowired
    public IPathService iPathService;




    /**
     * 保存、修改 【区分id即可】
     * @param user  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody User user){
        try {
            if(user.getId()!=null){
                Object r = new SimpleHash("MD5", user.getPassword(), null, 1024);
                    userService.updateById(user);
                if (user.getUsername() != null) {
                    Path path = new Path();
                    path.setUserName(user.getUsername());
                    iPathService.update(path, new EntityWrapper<Path>()
                            .eq("user_name", user.getUsername())
                    );
                }
            }else{
                Object r = new SimpleHash("MD5", user.getPassword(), null, 1024);
                    userService.insert(user);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    //删除对象信息

    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Long id){
        try {
            userService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！" + e.getMessage());
        }
    }

    //获取用户

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id")Long id)
    {
        return userService.selectById(id);
    }


    //查看所有的员工信息
    @RequiresPermissions(value = {"admin"}, logical = Logical.OR)
//    @RolesAllowed({"ADMIN"})
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<User> json(@RequestBody PageQuery query) {
        Page<User> page = new Page<User>(query.getPage(),query.getRows());
        page = userService.selectPage(page);
        return new PageList<User>(page.getPages(), page.getRecords());
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String, String> login(@RequestBody User user) {
        Map<String,String> result=new HashMap<String,String>();
        String userName = user.getUsername();
        String password = user.getPassword();
        boolean remeberMe = user.isRemeberMe();
        // 1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        // 2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password, remeberMe);
        // 3.执行登录方法
        try{
            subject.login(token);
            result.put("status","200");
            result.put("msg","successd");


        } catch (UnknownAccountException e){
            e.printStackTrace();
            result.put("status","200");
            result.put("msg","用户不存在");
        } catch (IncorrectCredentialsException e) {
            result.put("status", "400");
            result.put("msg", "密码错误");

        }
        return result;
    }
}
