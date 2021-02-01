package entity;

/**

 * @description: 驾驶员信息实体类
 * @author: WuXiang
 * @create: 2021-01-31 23:10
 **/
public class Driver {

    private Integer driverinfoID; //自动编号
    private String drivinglicenseNumber; //驾驶证号
    private String driverName; //驾驶员姓名
    private String driverSex; //驾驶员性别
    private Integer driverAge; //驾驶员年龄
    private String driverNumber; //驾驶员编号
    private String telephoneNumber; //联系电话
    private String driverAddress; //家庭住址
    private String drivingType; //准驾车型
    private String state; //状态
    private String commentInfo; //备注信息

    public Driver() {
    }

    public Driver(Integer driverinfoID, String drivinglicenseNumber, String driverName, String driverSex, Integer driverAge, String driverNumber, String telephoneNumber, String driverAddress, String drivingType, String state, String commentInfo) {
        this.driverinfoID = driverinfoID;
        this.drivinglicenseNumber = drivinglicenseNumber;
        this.driverName = driverName;
        this.driverSex = driverSex;
        this.driverAge = driverAge;
        this.driverNumber = driverNumber;
        this.telephoneNumber = telephoneNumber;
        this.driverAddress = driverAddress;
        this.drivingType = drivingType;
        this.state = state;
        this.commentInfo = commentInfo;
    }

    /**
     * 获取
     * @return driverinfoID
     */
    public Integer getDriverinfoID() {
        return driverinfoID;
    }

    /**
     * 设置
     * @param driverinfoID
     */
    public void setDriverinfoID(Integer driverinfoID) {
        this.driverinfoID = driverinfoID;
    }

    /**
     * 获取
     * @return drivinglicenseNumber
     */
    public String getDrivinglicenseNumber() {
        return drivinglicenseNumber;
    }

    /**
     * 设置
     * @param drivinglicenseNumber
     */
    public void setDrivinglicenseNumber(String drivinglicenseNumber) {
        this.drivinglicenseNumber = drivinglicenseNumber;
    }

    /**
     * 获取
     * @return driverName
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置
     * @param driverName
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 获取
     * @return driverSex
     */
    public String getDriverSex() {
        return driverSex;
    }

    /**
     * 设置
     * @param driverSex
     */
    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    /**
     * 获取
     * @return driverAge
     */
    public Integer getDriverAge() {
        return driverAge;
    }

    /**
     * 设置
     * @param driverAge
     */
    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    /**
     * 获取
     * @return driverNumber
     */
    public String getDriverNumber() {
        return driverNumber;
    }

    /**
     * 设置
     * @param driverNumber
     */
    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    /**
     * 获取
     * @return telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * 设置
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * 获取
     * @return driverAddress
     */
    public String getDriverAddress() {
        return driverAddress;
    }

    /**
     * 设置
     * @param driverAddress
     */
    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    /**
     * 获取
     * @return drivingType
     */
    public String getDrivingType() {
        return drivingType;
    }

    /**
     * 设置
     * @param drivingType
     */
    public void setDrivingType(String drivingType) {
        this.drivingType = drivingType;
    }

    /**
     * 获取
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * 设置
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取
     * @return commentInfo
     */
    public String getCommentInfo() {
        return commentInfo;
    }

    /**
     * 设置
     * @param commentInfo
     */
    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public String toString() {
        return "Driver{driverinfoID = " + driverinfoID + ", drivinglicenseNumber = " + drivinglicenseNumber + ", driverName = " + driverName + ", driverSex = " + driverSex + ", driverAge = " + driverAge + ", driverNumber = " + driverNumber + ", telephoneNumber = " + telephoneNumber + ", driverAddress = " + driverAddress + ", drivingType = " + drivingType + ", state = " + state + ", commentInfo = " + commentInfo + "}";
    }
}
