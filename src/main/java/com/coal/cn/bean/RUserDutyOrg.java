package com.coal.cn.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户、岗位对应表
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_r_user_duty_org")
public class RUserDutyOrg extends Model<RUserDutyOrg> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("user_dutyid")
    private String userDutyid;
    /**
     * 用户ID
     */
    @TableField("user_uuid")
    private String userUuid;
    /**
     * 岗位ID
     */
    private String dutyid;


    public String getUserDutyid() {
        return userDutyid;
    }

    public void setUserDutyid(String userDutyid) {
        this.userDutyid = userDutyid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid;
    }

    @Override
    protected Serializable pkVal() {
        return this.userDutyid;
    }

    @Override
    public String toString() {
        return "RUserDutyOrg{" +
        ", userDutyid=" + userDutyid +
        ", userUuid=" + userUuid +
        ", dutyid=" + dutyid +
        "}";
    }
}
