package entity;

/**
 * @description: 司机准驾车型类
 * @author: WuXiang
 * @create: 2021-01-31 23:30
 **/
public class Drivertype {
    private Integer id; //主键id

    private String drivertypename; //准驾车型


    public Drivertype() {
    }

    public Drivertype(Integer id, String drivertypename) {
        this.id = id;
        this.drivertypename = drivertypename;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return drivertypename
     */
    public String getDrivertypename() {
        return drivertypename;
    }

    /**
     * 设置
     * @param drivertypename
     */
    public void setDrivertypename(String drivertypename) {
        this.drivertypename = drivertypename;
    }

    public String toString() {
        return "Drivertype{id = " + id + ", drivertypename = " + drivertypename + "}";
    }
}
