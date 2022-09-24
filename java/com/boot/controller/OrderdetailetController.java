package com.boot.controller;

//import com.boot.controller.entity.Orderdetailet;
//import com.boot.controller.service.OrderdetailetService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import com.boot.entity.OrderDetailet;
import com.boot.service.OrderDetailetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Orderdetailet)表控制层
 *
 * @author makejava
 * @since 2022-09-01 16:37:14
 */
@RestController
@RequestMapping("orderdetailet")
public class OrderdetailetController {
    /**
     * 服务对象
     */
    @Resource
    private OrderDetailetService orderdetailetService;

    /**
     * 分页查询
     *
     * @param orderdetailet 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @GetMapping
//    public ResponseEntity<Page<OrderDetailet>> queryByPage(OrderDetailet orderdetailet, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.orderdetailetService.queryByPage(orderdetailet, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OrderDetailet> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.orderdetailetService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderdetailet 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OrderDetailet> add(OrderDetailet orderdetailet) {
        return ResponseEntity.ok(this.orderdetailetService.insert(orderdetailet));
    }

    /**
     * 编辑数据
     *
     * @param orderdetailet 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OrderDetailet> edit(OrderDetailet orderdetailet) {
        return ResponseEntity.ok(this.orderdetailetService.update(orderdetailet));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.orderdetailetService.deleteById(id));
    }

}

