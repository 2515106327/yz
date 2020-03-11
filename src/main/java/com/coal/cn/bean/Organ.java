package com.coal.cn.bean;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 组织机构
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_organ")
public class Organ extends Model<Organ> {

    private static final long serialVersionUID = 1L;

    @TableId("organ_uuid")
    private String organUuid;
    @TableField("organ_code")
    private String organCode;
    @TableField("organ_name")
    private String organName;
    @TableField("organ_type")
    private String organType;
    @TableField("in_use")
    private String inUse;
    @TableField("parent_uuid")
    private String parentUuid;
    /**
     * 是否删除
     */
    private String status;
    /**
     * 创建人ID
     */
    private String modifierid;
    /**
     * 创建时间
     */
    private Date modtime;
    /**
     * 描述
     */
    private String description;
    /**
     * 资金账户code
     */
    @TableField("account_code")
    private String accountCode;
    private String shortname;


    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }

    public String getInUse() {
        return inUse;
    }

    public void setInUse(String inUse) {
        this.inUse = inUse;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Override
    protected Serializable pkVal() {
        return this.organUuid;
    }

    @Override
    public String toString() {
        return "Organ{" +
        ", organUuid=" + organUuid +
        ", organCode=" + organCode +
        ", organName=" + organName +
        ", organType=" + organType +
        ", inUse=" + inUse +
        ", parentUuid=" + parentUuid +
        ", status=" + status +
        ", modifierid=" + modifierid +
        ", modtime=" + modtime +
        ", description=" + description +
        ", accountCode=" + accountCode +
        ", shortname=" + shortname +
        "}";
    }
}
