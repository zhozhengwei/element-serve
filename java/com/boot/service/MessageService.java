package com.boot.service;


import com.boot.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Message)表服务接口
 *
 * @author makejava
 * @since 2022-09-05 10:13:23
 */
public interface MessageService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Message queryById(Integer mId) throws Exception;

    /**
     * 分页查询
     *
     * @param message     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Message> queryByPage(Message message, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    Message insert(Message message);

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    Message update(Message message) throws Exception;

    Message updateOrderById(Message message);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId) throws Exception;

}
