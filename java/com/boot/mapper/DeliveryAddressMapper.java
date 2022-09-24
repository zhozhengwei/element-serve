package com.boot.mapper;


import com.boot.entity.DeliveryAddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【deliveryaddress】的数据库操作Mapper
* @createDate 2022-08-30 14:29:13
* @Entity generator.domain.Deliveryaddress
*/
@Mapper
@Repository
public interface DeliveryAddressMapper {

    //查询所有的配送地址信息
    @Select("SELECT * FROM deliveryaddress WHERE userId = #{userId} GROUP BY daId")
    public List<DeliveryAddress> listDeliveryAddressByUserId(Long userId) throws Exception;
    //通过配送地址编号daId，查询一个配送地址对象
    @Select("SELECT * FROM deliveryaddress WHERE daId = #{daId}")
    public DeliveryAddress getDeliveryAddressById(Long daId)throws Exception;
    //录入新的地址
    @Insert("insert into deliveryaddress values (null,#{contactName},#{contactSex},#{contactTel},#{address},#{userId})")
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress)throws Exception;
    //更新配送地址使用动态SQL
    @Update("update deliveryaddress set contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},address=#{address} where daId=#{daId}")
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress)throws Exception;
    //根据配送地址编号daId,删除配送地址
    @Delete("delete from deliveryaddress where daid = #{daId}")
    public int removeDeliveryAddress(Long daId)throws Exception;
}
