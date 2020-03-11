package com.coal.cn.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.Organ;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IOrganService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organ")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class OrganController {
    @Autowired
    public IOrganService organService;

    /**
     * 保存、修改 【区分id即可】
     * @param organ  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Organ organ){
        try {
            if(organ.getOrganUuid()!=null){
                    organService.updateById(organ);
            }else{
                    organService.insert(organ);
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
            organService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Organ get(@PathVariable("id")Long id)
    {
        return organService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Organ> list(){
        return organService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<Organ> json(@RequestBody PageQuery query) {
        Page<Organ> page = new Page<Organ>(query.getPage(),query.getRows());
        page = organService.selectPage(page);
        return new PageList<Organ>(page.getPages(), page.getRecords());
    }
}
