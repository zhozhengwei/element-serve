package com.boot.service.Impl;

import com.boot.entity.OrderDetailet;
import com.boot.mapper.OrderDetailetMapper;
import com.boot.service.OrderDetailetService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Orderdetailet)表服务实现类
 *
 * @author makejava
 * @since 2022-09-01 13:42:03
 */
@Service
public class OrderDetailetServiceImpl implements OrderDetailetService {
    @Resource
    private OrderDetailetMapper orderdetailetDao;

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    @Override
    public OrderDetailet queryById(Long odid) {
        return this.orderdetailetDao.queryById(odid);
    }

    /**
     * 分页查询
     *
     * @param orderdetailet 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Orderdetailet> queryByPage(Orderdetailet orderdetailet, PageRequest pageRequest) {
//        long total = this.orderdetailetDao.count(orderdetailet);
//        return new PageImpl<>(this.orderdetailetDao.queryAllByLimit(orderdetailet, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param orderdetailet 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetailet insert(OrderDetailet orderdetailet) {
        this.orderdetailetDao.insert(orderdetailet);
        return orderdetailet;
    }

    /**
     * 修改数据
     *
     * @param orderdetailet 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetailet update(OrderDetailet orderdetailet) {
        this.orderdetailetDao.update(orderdetailet);
        return this.queryById(orderdetailet.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param odId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long odId) {
        return this.orderdetailetDao.deleteById(odId) > 0;
    }
}
