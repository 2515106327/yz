package com.coal.cn.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 岗位表（角色和单位的挂接）
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_r_role_organ")
public class RRoleOrgan extends Model<RRoleOrgan> {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位ID
     */
    private String dutyid;
    /**
     * 岗位名称
     */
    private String name;
    /**
     * 组织ID
     */
    @TableField("organ_uuid")
    private String organUuid;
    /**
     * 角色ID
     */
    @TableField("role_uuid")
    private String roleUuid;


    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid;
    }

    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    @Override
    protected Serializable pkVal() {
        return this.dutyid;
    }

    @Override
    public String toString() {
        return "RRoleOrgan{" +
        ", dutyid=" + dutyid +
        ", name=" + name +
        ", organUuid=" + organUuid +
        ", roleUuid=" + roleUuid +
        "}";
    }
}
