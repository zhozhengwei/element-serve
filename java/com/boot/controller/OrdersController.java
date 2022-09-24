package com.boot.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Orders;
import com.boot.service.OrdersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2022-09-01 11:17:52
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;




    /**
     * 分页查询
     *
     * @param orders      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<Orders>> queryByPage(Orders orders, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.ordersService.queryByPage(orders, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Orders> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ordersService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orders 实体
     * @return 新增结果
     */
    @RequestMapping("/create")
    public R add(Orders orders) {
        try {
            return R.ok().values("orderId",ordersService.CreateOrder(orders));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"订单保存失败");
        }
    }

    /**
     * 通过用户ID查询订单信息列表
     * @param userId 用户ID
     * @return
     */
    @GetMapping("/information/{userId}")
    public R listOrdersByUserId(@PathVariable Long userId) {
        System.out.println("userID"+userId);
            try {
                return R.ok().values("orders",ordersService.listOrdersByUserId(userId));
            } catch (Exception e) {
                e.printStackTrace();
                return R.error(RsultCode.DATA_EXEC_WRONG,"信息获取失败！");
            }
    }

    @GetMapping("/pageNew/{orderId}")
    public R getOrderById(@PathVariable Long orderId){
        try {
            return R.ok().values("order",ordersService.getOrderById(orderId));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"单个信息获取失败！");
        }
    }


    @PostMapping("/updateStatus")
    public R updateOrderById(Orders order){
        try {
            System.out.println("信息"+order.toString());
            int byId = ordersService.updateOrderById(order);
            return R.ok().values("count",byId);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"无影响");
        }
    }

    /**
     * 编辑数据
     *
     * @param orders 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Orders> edit(Orders orders) {
        return ResponseEntity.ok(this.ordersService.update(orders));
    }

    /**
     * 删除数据
     *
     * @param orderId 主键
     * @return 删除是否成功
     */
    @GetMapping("/deleteOrderById/{orderId}")
    public R deleteById(@PathVariable Long orderId) {
        return R.ok().values("bool",this.ordersService.deleteById(orderId));
    }

}

