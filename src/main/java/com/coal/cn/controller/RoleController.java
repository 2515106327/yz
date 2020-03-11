package com.coal.cn.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.Role;
import com.coal.cn.bean.RoleRes;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IRoleService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class RoleController {
    @Autowired
    public IRoleService roleService;

    /**
     * 保存、修改 【区分id即可】
     * @param role  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Role role){
        try {
            if(role.getRoleUuid()!=null){
                    roleService.updateById(role);
            }else{
                    roleService.insert(role);
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
            roleService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Role get(@PathVariable("id")Long id)
    {
        return roleService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Role> list(){
        return roleService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/getRoles",method = RequestMethod.GET)
    public PageList<Role> json(@RequestParam("pageSize") int pageSize, @RequestParam("pageNumber") int pageNumber) {
        Page<Role> page = new Page<Role>(pageNumber,pageSize);
        page = roleService.selectPage(page);
        return new PageList<Role>(page.getPages(), page.getRecords());
    }

}
