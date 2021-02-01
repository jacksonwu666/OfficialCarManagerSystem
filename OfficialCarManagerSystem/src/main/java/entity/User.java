package entity;

/**
 * @description: User类
 * @author: WuXiang
 * @create: 2021-01-31 23:34
 **/
public class User {
    //用户id
    private String userinfoId;
    //用户账户
    private String userAccount;
    //用户名
    private String userName;
    //密码
    private String pwd;
    //性别
    private String sex;
    //电话号码
    private String telephone;
    //住址
    private String address;
    //部门名
    private String departName;
    // 角色id 权限管理  1 超级管理员 2 管理员 其他 普通用户
    private String roleId;


    public User() {
    }

    public User(String userinfoId, String userAccount, String userName, String pwd, String sex, String telephone, String address, String departName, String roleId) {
        this.userinfoId = userinfoId;
        this.userAccount = userAccount;
        this.userName = userName;
        this.pwd = pwd;
        this.sex = sex;
        this.telephone = telephone;
        this.address = address;
        this.departName = departName;
        this.roleId = roleId;
    }

    /**
     * 获取
     * @return userinfoId
     */
    public String getUserinfoId() {
        return userinfoId;
    }

    /**
     * 设置
     * @param userinfoId
     */
    public void setUserinfoId(String userinfoId) {
        this.userinfoId = userinfoId;
    }

    /**
     * 获取
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置
     * @param userAccount
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return departName
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * 设置
     * @param departName
     */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    /**
     * 获取
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String toString() {
        return "User{userinfoId = " + userinfoId + ", userAccount = " + userAccount + ", userName = " + userName + ", pwd = " + pwd + ", sex = " + sex + ", telephone = " + telephone + ", address = " + address + ", departName = " + departName + ", roleId = " + roleId + "}";
    }
}
