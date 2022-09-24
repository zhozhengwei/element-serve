package com.boot.service;


//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

import com.boot.entity.Orders;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2022-09-01 11:17:56
 */
public interface OrdersService {

    public Long CreateOrder(Orders orders) throws Exception;

    public Orders getOrderById(Long orderId) throws Exception;

    public List<Orders> listOrdersByUserId(Long userId) throws Exception;

    public List<Orders> listOrdersMessageByUserId(Long userId) throws Exception;
    int updateOrderById(Orders orders) throws Exception;

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Orders queryById(Long orderid);

    /**
     * 分页查询
     *
     * @param orders      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Orders> queryByPage(Orders orders, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders insert(Orders orders);

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders update(Orders orders);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    boolean deleteById(Long orderid);

}
