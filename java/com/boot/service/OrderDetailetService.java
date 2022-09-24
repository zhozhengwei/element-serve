package com.boot.service;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

import com.boot.entity.OrderDetailet;

/**
 * (Orderdetailet)表服务接口
 *
 * @author makejava
 * @since 2022-09-01 13:42:02
 */
public interface OrderDetailetService {

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    OrderDetailet queryById(Long odid);

    /**
     * 分页查询
     *
     * @param orderdetailet 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
//    Page<OrderDetailet> queryByPage(OrderDetailet orderdetailet, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderdetailet 实例对象
     * @return 实例对象
     */
    OrderDetailet insert(OrderDetailet orderdetailet);

    /**
     * 修改数据
     *
     * @param orderdetailet 实例对象
     * @return 实例对象
     */
    OrderDetailet update(OrderDetailet orderdetailet);

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 是否成功
     */
    boolean deleteById(Long odid);

}
