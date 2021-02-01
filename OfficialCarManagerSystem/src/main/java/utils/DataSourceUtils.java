package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: OfficialCarManagerSystem
 * @description: 数据库连接工具类
 * @author: WuXiang
 * @create: 2021-01-28 22:43
 **/
public class DataSourceUtils {
    //创建数据源（数据库连接池）
    private static DataSource dataSource = new ComboPooledDataSource();

    //线程变量
   private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    /**
     * @Description 直接获取一个连接池
     * @Date 22:50 2021-01-28
     * @Param []
     * @return javax.sql.DataSource
     **/
    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * @Description 获取连接对象
     * @Date 22:51 2021-01-28
     * @Param []
     * @return java.sql.Connection
     **/
    public static Connection getConnection() throws SQLException {
        Connection conn = tl.get();
        if (conn == null){
            conn = dataSource.getConnection();
            tl.set(conn);
        }
        return conn;
    }

    /**
     * @Description  开启事务
     * @Date 22:51 2021-01-28
     * @Param []
     * @return void
     **/
    public static void startTransaction() throws SQLException {
        Connection conn = getConnection();
        if (conn != null){
            //关闭自动提交事务
            conn.setAutoCommit(false);
        }

    }
    /**
     * @Description 事务回滚
     * @Date 22:51 2021-01-28
     * @Param
     * @return
     **/

    public static void rollback() throws SQLException {
        Connection conn = getConnection();
        if (conn!=null){
           conn.rollback();
        }
    }

    /**
     * @Description 提交并且 关闭资源及从 ThreadLocal 中释放
     * @Date 22:54 2021-01-28
     * @Param
     * @return
     **/
    public static void commitAndRelease() throws SQLException {
        Connection conn = getConnection();
        if (conn != null){
            conn.commit(); //事务提交
            conn.close(); //关闭资源
            tl.remove(); //从线程绑定中解除
        }
    }
    /**
     * @Description 关闭资源的方法
     * @Date 22:56 2021-01-28
     * @Param
     * @return
     **/
    public static void closeConnection() throws SQLException {
        Connection conn = getConnection();
        if (conn != null){
            conn.close();
        }
    }

    public static void closeStatement(Statement st) throws SQLException {
        if (st != null){
            st.close();
        }
    }

    public static void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null){
            rs.close();
        }
    }

}
