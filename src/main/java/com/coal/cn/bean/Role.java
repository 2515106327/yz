package com.coal.cn.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId("role_uuid")
    private String roleUuid;
    @TableField("role_id")
    private String roleId;
    @TableField("role_name")
    private String roleName;


    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleUuid;
    }

    @Override
    public String toString() {
        return "Role{" +
        ", roleUuid=" + roleUuid +
        ", roleId=" + roleId +
        ", roleName=" + roleName +
        "}";
    }
}
