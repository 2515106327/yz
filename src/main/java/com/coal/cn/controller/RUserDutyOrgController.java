package com.coal.cn.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.RUserDutyOrg;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IRUserDutyOrgService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rUserDutyOrg")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class RUserDutyOrgController {
    @Autowired
    public IRUserDutyOrgService rUserDutyOrgService;

    /**
     * 保存、修改 【区分id即可】
     * @param rUserDutyOrg  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody RUserDutyOrg rUserDutyOrg){
        try {
            if(rUserDutyOrg.getUserDutyid()!=null){
                    rUserDutyOrgService.updateById(rUserDutyOrg);
            }else{
                    rUserDutyOrgService.insert(rUserDutyOrg);
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
            rUserDutyOrgService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public RUserDutyOrg get(@PathVariable("id")Long id)
    {
        return rUserDutyOrgService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<RUserDutyOrg> list(){
        return rUserDutyOrgService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<RUserDutyOrg> json(@RequestBody PageQuery query) {
        Page<RUserDutyOrg> page = new Page<RUserDutyOrg>(query.getPage(),query.getRows());
        page = rUserDutyOrgService.selectPage(page);
        return new PageList<RUserDutyOrg>(page.getPages(), page.getRecords());
    }
}
