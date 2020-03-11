package com.coal.cn.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.RoleRes;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IRoleResService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roleRes")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class RoleResController {
    @Autowired
    public IRoleResService roleResService;

    /**
     * 保存、修改 【区分id即可】
     * @param roleRes  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody RoleRes roleRes){
        try {
            if(roleRes.getResUuid()!=null){
                    roleResService.updateById(roleRes);
            }else{
                    roleResService.insert(roleRes);
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
            roleResService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public RoleRes get(@PathVariable("id")Long id)
    {
        return roleResService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<RoleRes> list(){
        return roleResService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/getRoles{pageSize}{pageNumber}{_}",method = RequestMethod.GET)
    public PageList<RoleRes> json(@PathVariable("pageSize") int pageSize, @PathVariable("pageNumber") int pageNumber, @PathVariable String _) {
        Page<RoleRes> page = new Page<RoleRes>(pageSize,pageNumber);
        page = roleResService.selectPage(page);
        return new PageList<RoleRes>(page.getPages(), page.getRecords());
    }
}
