package com.boot.service.Impl;

import com.boot.entity.Cart;
import com.boot.entity.Message;
import com.boot.entity.OrderDetailet;
import com.boot.entity.Orders;
import com.boot.mapper.CartMapper;
import com.boot.mapper.MessageMapper;
import com.boot.mapper.OrderDetailetMapper;
import com.boot.mapper.OrdersMapper;
import com.boot.service.OrdersService;



//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
import com.boot.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2022-09-01 11:17:57
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Autowired
    private CartMapper cartMapper;

    @Autowired(required = false)
    private OrderDetailetMapper orderDetailetMapper;

    @Autowired(required = false)
    private MessageMapper messageMapper;

    @Override
    @Transactional
    public Long CreateOrder(Orders orders) throws Exception {
        //1、查询当前用户的购物车中的数据
        Cart cart = new Cart();
        cart.setUserId(orders.getUserId());
        cart.setBusinessId(orders.getBusinessId());
        List<Cart> cartList = cartMapper.listCart(cart);

        //2、创建订单（程序获取返回生成的订单编号）
        orders.setOrderDate(CommonUtils.getSysTime());
        ordersMapper.saveOrder(orders);
        Long orderId = orders.getOrderId();

        //记录订单消息状态
        Message message = new Message();
        message.setOrderId(orderId);
        message.setUserId(orders.getUserId());
        message.setStatus(0);
        messageMapper.insert(message);
        //3、批量添加订单的明细
        List<OrderDetailet> od_list = new ArrayList<>();
        for(Cart c : cartList){
            OrderDetailet od = new OrderDetailet();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            od_list.add(od);
        }
        orderDetailetMapper.saveOrderDetailet(od_list);
        //4、清空购物车数据 删除购物车中和订单相关的餐品信息
        cartMapper.removeCart(cart);
        return orderId;
    }

    @Override
    public Orders getOrderById(Long orderId) throws Exception {
        return ordersMapper.getOrderById(orderId);
    }

    @Override
    public List<Orders> listOrdersByUserId(Long userId) throws Exception {
        List<Orders> ordersList = ordersMapper.listOrdersByUserId(userId);
        return ordersList;
    }

    @Override
    public List<Orders> listOrdersMessageByUserId(Long userId) throws Exception {
        return ordersMapper.listOrdersMessageByUserId(userId);
    }

    @Override
    public int updateOrderById(Orders orders) throws Exception {
        return ordersMapper.updateOrderById(orders);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public Orders queryById(Long orderId) {
        return this.ordersMapper.queryById(orderId);
    }

    /**
     * 分页查询
     *
     * @param orders      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Orders> queryByPage(Orders orders, PageRequest pageRequest) {
//        long total = this.ordersMapper.count(orders);
//        return new PageImpl<>(this.ordersMapper.queryAllByLimit(orders, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders insert(Orders orders) {
        this.ordersMapper.insert(orders);
        return orders;
    }

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders update(Orders orders) {
        this.ordersMapper.update(orders);
        return this.queryById(orders.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderid) {
        return this.ordersMapper.deleteById(orderid) > 0;
    }
}
