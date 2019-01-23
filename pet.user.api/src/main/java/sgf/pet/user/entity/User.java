package sgf.pet.user.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @ClassName: User 
 * @Description: TODO
 * @author: sgf
 * @date: 2019年1月23日 下午4:37:37
 */
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_DATE")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_DATE")
    private Date updateDate;

    @ApiModelProperty(value = "状态：0：不正常  1：正常 ")
    @TableField("STATUS")
    private Integer status;

    @ApiModelProperty(value = "用户名")
    @TableField("USER_NAME")
    private String userName;

    @ApiModelProperty(value = "密码")
    @TableField("PASSWORD")
    private String password;

    @ApiModelProperty(value = "类型：1：运营  2：商家  3：普通用户")
    @TableField("TYPE")
    private Integer type;

    @ApiModelProperty(value = "权限：0：未认证  1：已认证")
    @TableField("PRIVILEGE")
    private Integer privilege;

    @ApiModelProperty(value = "电话号码")
    @TableField("PHONE")
    private String phone;

    @ApiModelProperty(value = "真实名称（公司名称）")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "头像")
    @TableField("HEAD_PIC")
    private String headPic;

    @ApiModelProperty(value = "账户余额")
    @TableField("ACCOUNT_BALANCE")
    private BigDecimal accountBalance;

    @ApiModelProperty(value = "性别 0：女  1：男")
    @TableField("SEX")
    private Integer sex;

    @ApiModelProperty(value = "邮箱")
    @TableField("EMAIL")
    private String email;

    @ApiModelProperty(value = "是否升级为商家 0：否  1：是")
    @TableField("CHANGE_TYPE")
    private Integer changeType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", status=" + status +
        ", userName=" + userName +
        ", password=" + password +
        ", type=" + type +
        ", privilege=" + privilege +
        ", phone=" + phone +
        ", name=" + name +
        ", headPic=" + headPic +
        ", accountBalance=" + accountBalance +
        ", sex=" + sex +
        ", email=" + email +
        ", changeType=" + changeType +
        "}";
    }
}
