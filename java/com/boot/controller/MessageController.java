package com.boot.controller;


import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Message;
import com.boot.service.MessageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Message)表控制层
 *
 * @author makejava
 * @since 2022-09-05 10:13:16
 */
@RestController
@RequestMapping("message")
public class MessageController {
    /**
     * 服务对象
     */
    @Resource
    private MessageService messageService;

    /**
     * 分页查询
     *
     * @param message     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Message>> queryByPage(Message message, PageRequest pageRequest) {
        return ResponseEntity.ok(this.messageService.queryByPage(message, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Message> queryById(@PathVariable("id") Integer id) {
        Message message = null;
        try {
            message = this.messageService.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(message);
    }




    /**
     * 新增数据
     *
     * @param message 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Message> add(Message message) {
        return ResponseEntity.ok(this.messageService.insert(message));
    }

    /**
     * 编辑数据
     *
     * @param message 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Message> edit(Message message) throws Exception {
        return ResponseEntity.ok(this.messageService.update(message));
    }


//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById(Integer id){
//        try {
//            return ResponseEntity.ok(this.messageService.deleteById(id));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @PostMapping("/updateOrderByIdState")
    public R updateOrderByIdState(@RequestBody Message message){
        System.out.println(message.toString());
        try {
            return R.ok().values("message",this.messageService.update(message));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"修改记录失败！");
        }
    }

    /**
     * 删除数据
     *
     * @param mid 主键
     * @return 删除是否成功
     */
    @GetMapping("/eliminate/{mid}")
    public R removeMessage(@PathVariable Integer mid){
        try {
            boolean id = messageService.deleteById(mid);
            return R.ok().values("bool",id);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"删除失败！");
        }

    }
}

