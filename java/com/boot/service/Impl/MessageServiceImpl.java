package com.boot.service.Impl;


import com.boot.entity.Message;
import com.boot.mapper.MessageMapper;
import com.boot.service.MessageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Message)表服务实现类
 *
 * @author makejava
 * @since 2022-09-05 10:13:23
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageMapper messageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public Message queryById(Integer mId) throws Exception {
        return this.messageDao.queryById(mId);
    }

    /**
     * 分页查询
     *
     * @param message     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Message> queryByPage(Message message, PageRequest pageRequest) {
        long total = this.messageDao.count(message);
        return new PageImpl<>(this.messageDao.queryAllByLimit(message, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public Message insert(Message message) {
        this.messageDao.insert(message);
        return message;
    }

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public Message update(Message message) throws Exception {
        this.messageDao.update(message);
        return this.queryById(message.getMId());
    }

    @Override
    public Message updateOrderById(Message message) {
        this.messageDao.updateOrderById(message);
        return messageDao.queryByOrderId(message.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) throws Exception {
        return this.messageDao.deleteById(mId) > 0;
    }
}
