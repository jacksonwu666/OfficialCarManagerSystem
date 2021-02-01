package entity;

/**
 * @description: 乘车类型实体类
 * @author: WuXiang
 * @create: 2021-01-31 23:26
 **/
public class Cartype {

    private Integer cartypeID; //自动编号
    private String vehicleClassname; //车辆分类名称
    private String commentInfo; //备注信息
    private String state; //0 损坏 1 正常 2 借出


    public Cartype() {
    }

    public Cartype(Integer cartypeID, String vehicleClassname, String commentInfo, String state) {
        this.cartypeID = cartypeID;
        this.vehicleClassname = vehicleClassname;
        this.commentInfo = commentInfo;
        this.state = state;
    }

    /**
     * 获取
     * @return cartypeID
     */
    public Integer getCartypeID() {
        return cartypeID;
    }

    /**
     * 设置
     * @param cartypeID
     */
    public void setCartypeID(Integer cartypeID) {
        this.cartypeID = cartypeID;
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

    public String toString() {
        return "Cartype{cartypeID = " + cartypeID + ", vehicleClassname = " + vehicleClassname + ", commentInfo = " + commentInfo + ", state = " + state + "}";
    }
}
