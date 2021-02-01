package entity;

/**
 * @description: 车辆信息实体类
 * @author: WuXiang
 * @create: 2021-01-31 23:19
 **/
public class Carinfo {

    private Integer carinfoID; //车辆编号
    private String platenumber; // 车牌号码
    private String vehicleClassname; //车辆类型
    private String frameNumber;//车架号
    private String factoryNumber; //出厂编号
    private String brandModel; //品牌型号
    private String regTime; //注册时间
    private String examinationTime; //年检时间
    private Integer ratedPassengers; //载客定员
    private String state; //状态 无效 0 有效 1
    private String commentInfo;//备注信息


    public Carinfo() {
    }

    public Carinfo(Integer carinfoID, String platenumber, String vehicleClassname, String frameNumber, String factoryNumber, String brandModel, String regTime, String examinationTime, Integer ratedPassengers, String state, String commentInfo) {
        this.carinfoID = carinfoID;
        this.platenumber = platenumber;
        this.vehicleClassname = vehicleClassname;
        this.frameNumber = frameNumber;
        this.factoryNumber = factoryNumber;
        this.brandModel = brandModel;
        this.regTime = regTime;
        this.examinationTime = examinationTime;
        this.ratedPassengers = ratedPassengers;
        this.state = state;
        this.commentInfo = commentInfo;
    }

    /**
     * 获取
     * @return carinfoID
     */
    public Integer getCarinfoID() {
        return carinfoID;
    }

    /**
     * 设置
     * @param carinfoID
     */
    public void setCarinfoID(Integer carinfoID) {
        this.carinfoID = carinfoID;
    }

    /**
     * 获取
     * @return platenumber
     */
    public String getPlatenumber() {
        return platenumber;
    }

    /**
     * 设置
     * @param platenumber
     */
    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    /**
     * 获取
     * @return vehicleClassname
     */
    public String getVehicleClassname() {
        return vehicleClassname;
    }

    /**
     * 设置
     * @param vehicleClassname
     */
    public void setVehicleClassname(String vehicleClassname) {
        this.vehicleClassname = vehicleClassname;
    }

    /**
     * 获取
     * @return frameNumber
     */
    public String getFrameNumber() {
        return frameNumber;
    }

    /**
     * 设置
     * @param frameNumber
     */
    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    /**
     * 获取
     * @return factoryNumber
     */
    public String getFactoryNumber() {
        return factoryNumber;
    }

    /**
     * 设置
     * @param factoryNumber
     */
    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    /**
     * 获取
     * @return brandModel
     */
    public String getBrandModel() {
        return brandModel;
    }

    /**
     * 设置
     * @param brandModel
     */
    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    /**
     * 获取
     * @return regTime
     */
    public String getRegTime() {
        return regTime;
    }

    /**
     * 设置
     * @param regTime
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取
     * @return examinationTime
     */
    public String getExaminationTime() {
        return examinationTime;
    }

    /**
     * 设置
     * @param examinationTime
     */
    public void setExaminationTime(String examinationTime) {
        this.examinationTime = examinationTime;
    }

    /**
     * 获取
     * @return ratedPassengers
     */
    public Integer getRatedPassengers() {
        return ratedPassengers;
    }

    /**
     * 设置
     * @param ratedPassengers
     */
    public void setRatedPassengers(Integer ratedPassengers) {
        this.ratedPassengers = ratedPassengers;
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
        return "Carinfo{carinfoID = " + carinfoID + ", platenumber = " + platenumber + ", vehicleClassname = " + vehicleClassname + ", frameNumber = " + frameNumber + ", factoryNumber = " + factoryNumber + ", brandModel = " + brandModel + ", regTime = " + regTime + ", examinationTime = " + examinationTime + ", ratedPassengers = " + ratedPassengers + ", state = " + state + ", commentInfo = " + commentInfo + "}";
    }
}
