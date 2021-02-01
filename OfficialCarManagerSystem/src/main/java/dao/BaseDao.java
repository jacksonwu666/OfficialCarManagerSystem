package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.DataSourceUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @program: OfficialCarManagerSystem
 * @description: 通用数据交互类
 * @author: WuXiang
 * @create: 2021-01-30 23:04
 **/
public class BaseDao<T>{
    QueryRunner runner = new QueryRunner();

    //增删改
    public int update(String sql,Object...params) throws SQLException {
        return runner.update(sql,params);
    }
    //查询单行单列的值
    public Object getSingleValue(String sql , Object...params) throws SQLException {
        return runner.query(DataSourceUtils.getConnection(),sql,new ScalarHandler<>(),params);
    }

    //查询列表
    public List<T> getBeanList(String sql,Class<T> clazz,Object...params) throws SQLException {
        return runner.query(DataSourceUtils.getConnection(),sql,new BeanListHandler<>(clazz),params);
    }

    //查询单个对象
    public T getBean(String sql ,Class<T> clazz,Object...params) throws SQLException {
        return runner.query(DataSourceUtils.getConnection(),sql,new BeanHandler<>(clazz),params);
    }

    //查询不同类型的值
    public List<Map<String,Object>> getMapLsit(String sql,Object...params) throws SQLException {
        return runner.query(DataSourceUtils.getConnection(),sql,new MapListHandler(),params);
    }
}
