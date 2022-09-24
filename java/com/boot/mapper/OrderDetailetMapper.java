package com.boot.mapper;

import com.boot.entity.OrderDetailet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
//import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Orderdetailet)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-01 13:42:00
 */
@Mapper
@Repository
public interface OrderDetailetMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    OrderDetailet queryById(Long odid);

    /**
     * 查询指定行数据
     *
     * @param orderdetailet 查询条件
     * @param pageable      分页对象
     * @return 对象列表
     */
//    List<Orderdetailet> queryAllByLimit(Orderdetailet orderdetailet, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param orderdetailet 查询条件
     * @return 总行数
     */
    long count(OrderDetailet orderdetailet);

    /**
     * 新增数据
     *
     * @param orderdetailet 实例对象
     * @return 影响行数
     */
    int insert(OrderDetailet orderdetailet);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Orderdetailet> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderDetailet> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Orderdetailet> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderDetailet> entities);

    /**
     * 修改数据
     *
     * @param orderdetailet 实例对象
     * @return 影响行数
     */
    int update(OrderDetailet orderdetailet);

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 影响行数
     */
    int deleteById(Long odid);

    //保存订单的明细信息
    public int saveOrderDetailet(List<OrderDetailet> list);

    public List<OrderDetailet> listOrderDateiletByOrderId(Long orderId);

}

