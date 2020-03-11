package com.coal.cn.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 菜单目录表
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_menu_directory")
@Data
public class MenuDirectory extends Model<MenuDirectory> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单目录id（树型结构层级编码）
     */
    @TableId("menu_id")
    private String menuId;
    /**
     * 菜单目录编号
     */
    @TableField("dir_code")
    private String dirCode;
    /**
     * 菜单目录名称
     */
    @TableField("dir_name")
    private String dirName;
    /**
     * 菜单目录级数
     */
    @TableField("dir_level_number")
    private Integer dirLevelNumber;
    /**
     * 菜单目录类型：0，业务；1，系统；2，实施；4，集成；5，Demo
     */
    @TableField("dir_type")
    private String dirType;
    /**
     * 菜单资源id
     */
    @TableField("resource_id")
    private String resourceId;
    /**
     * 父目录id
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 明细否：0 非明细；1 明细
     */
    private String isitem;
    /**
     * 菜单目录顺序号
     */
    @TableField("dir_order")
    private Integer dirOrder;
    /**
     * 是否删除：0 是；1 否
     */
    private String status;
    /**
     * 启/停状态：0 停用；1 启用
     */
    private String flag;
    /**
     * 菜单类别id
     */
    @TableField("menu_group_id")
    private String menuGroupId;
    /**
     * 当前国际化标志
     */
    private String locale;
    @TableField("res_uuid")
    private String resUuid;
    /**
     * id
     */
    private String realid;
    private String istransfer;
    @TableField("menu_type")
    private String menuType;


    @Override
    protected Serializable pkVal() {
        return null;
    }
}
