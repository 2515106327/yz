package com.coal.cn.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.coal.cn.bean.MenuDirectory;
import com.coal.cn.query.PageQuery;
import com.coal.cn.service.IMenuDirectoryService;
import com.coal.cn.util.AjaxResult;
import com.coal.cn.util.PageList;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menuDirectory")
@Api(tags = "swagger使用规范", description = "用于展示swagger使用规范的接口列表")
public class MenuDirectoryController {
    @Autowired
    public IMenuDirectoryService menuDirectoryService;

    /**
     * 保存、修改 【区分id即可】
     * @param menuDirectory  传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody MenuDirectory menuDirectory){
        try {
            if(menuDirectory.getMenuId()!=null){
                    menuDirectoryService.updateById(menuDirectory);
            }else{
                    menuDirectoryService.insert(menuDirectory);
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
            menuDirectoryService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public MenuDirectory get(@PathVariable("id")Long id)
    {
        return menuDirectoryService.selectById(id);
    }


    //查看所有的员工信息
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<MenuDirectory> list(){
        return menuDirectoryService.selectList(null);
    }


    /**
    * 分页查询数据：
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<MenuDirectory> json(@RequestBody PageQuery query) {
        Page<MenuDirectory> page = new Page<MenuDirectory>(query.getPage(),query.getRows());
        page = menuDirectoryService.selectPage(page);
        return new PageList<MenuDirectory>(page.getPages(), page.getRecords());
    }
}
