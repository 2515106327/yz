package com.coal.cn.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.RRoleOrgan;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IRRoleOrganService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rRoleOrgan")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class RRoleOrganController {
    @Autowired
    public IRRoleOrganService rRoleOrganService;

    /**
     * 保存、修改 【区分id即可】
     * @param rRoleOrgan  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody RRoleOrgan rRoleOrgan){
        try {
            if(rRoleOrgan.getDutyid()!=null){
                    rRoleOrganService.updateById(rRoleOrgan);
            }else{
                    rRoleOrganService.insert(rRoleOrgan);
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
            rRoleOrganService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public RRoleOrgan get(@PathVariable("id")Long id)
    {
        return rRoleOrganService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<RRoleOrgan> list(){
        return rRoleOrganService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<RRoleOrgan> json(@RequestBody PageQuery query) {
        Page<RRoleOrgan> page = new Page<RRoleOrgan>(query.getPage(),query.getRows());
        page = rRoleOrganService.selectPage(page);
        return new PageList<RRoleOrgan>(page.getPages(), page.getRecords());
    }
}
