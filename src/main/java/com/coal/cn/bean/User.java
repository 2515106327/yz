package com.coal.cn.bean;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@TableName("pt_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId("user_uuid")
    private String userUuid;
    private String id;
    /**
     * 登录名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    private String email;
    private String mobile;
    private BigDecimal enabled;
    @TableField("account_non_expired")
    private BigDecimal accountNonExpired;
    @TableField("credentials_non_expired")
    private BigDecimal credentialsNonExpired;
    @TableField("account_non_locked")
    private BigDecimal accountNonLocked;
    /**
     * 机构ID
     */
    @TableField("organ_uuid")
    private String organUuid;
    /**
     * 姓名
     */
    @TableField("nice_name")
    private String niceName;
    @TableField("is_admin")
    private BigDecimal isAdmin;
    /**
     * 1
     */
    private BigDecimal maximumsessions;
    /**
     * 注册日期
     */
    private Date registerdate;
    /**
     * 最近登陆时间
     */
    private Date lastlogintime;
    /**
     * 密保问题
     */
    private String pwdque;
    /**
     * 密保答案
     */
    private String pwdans;
    /**
     * 备注
     */
    private String remark;
    /**
     * 部门ID
     */
    private String depid;
    /**
     * 是否删除
     */
    private String status;
    /**
     * 操作时间
     */
    private Date modtime;
    /**
     * 操作人ID
     */
    private String modifierid;
    /**
     * 是否阳光用户（0否1是）
     */
    @TableField("is_sum")
    private BigDecimal isSum;


    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getEnabled() {
        return enabled;
    }

    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(BigDecimal accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public BigDecimal getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(BigDecimal credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public BigDecimal getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(BigDecimal accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public BigDecimal getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(BigDecimal isAdmin) {
        this.isAdmin = isAdmin;
    }

    public BigDecimal getMaximumsessions() {
        return maximumsessions;
    }

    public void setMaximumsessions(BigDecimal maximumsessions) {
        this.maximumsessions = maximumsessions;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getPwdque() {
        return pwdque;
    }

    public void setPwdque(String pwdque) {
        this.pwdque = pwdque;
    }

    public String getPwdans() {
        return pwdans;
    }

    public void setPwdans(String pwdans) {
        this.pwdans = pwdans;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public BigDecimal getIsSum() {
        return isSum;
    }

    public void setIsSum(BigDecimal isSum) {
        this.isSum = isSum;
    }

    @Override
    protected Serializable pkVal() {
        return this.userUuid;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userUuid=" + userUuid +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", email=" + email +
        ", mobile=" + mobile +
        ", enabled=" + enabled +
        ", accountNonExpired=" + accountNonExpired +
        ", credentialsNonExpired=" + credentialsNonExpired +
        ", accountNonLocked=" + accountNonLocked +
        ", organUuid=" + organUuid +
        ", niceName=" + niceName +
        ", isAdmin=" + isAdmin +
        ", maximumsessions=" + maximumsessions +
        ", registerdate=" + registerdate +
        ", lastlogintime=" + lastlogintime +
        ", pwdque=" + pwdque +
        ", pwdans=" + pwdans +
        ", remark=" + remark +
        ", depid=" + depid +
        ", status=" + status +
        ", modtime=" + modtime +
        ", modifierid=" + modifierid +
        ", isSum=" + isSum +
        "}";
    }
}
