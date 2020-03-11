package com.coal.cn.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色资源配置
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_role_res")
public class RoleRes extends Model<RoleRes> {

    private static final long serialVersionUID = 1L;

    @TableField("role_uuid")
    private String roleUuid;
    /**
     * 菜单目录id（树型结构层级编码）
     */
    @TableField("res_uuid")
    private String resUuid;


    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    public String getResUuid() {
        return resUuid;
    }

    public void setResUuid(String resUuid) {
        this.resUuid = resUuid;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleUuid;
    }

    @Override
    public String toString() {
        return "RoleRes{" +
        ", roleUuid=" + roleUuid +
        ", resUuid=" + resUuid +
        "}";
    }
}
