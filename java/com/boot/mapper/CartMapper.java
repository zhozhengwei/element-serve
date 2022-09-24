package com.boot.mapper;


import com.boot.entity.Cart;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【cart】的数据库操作Mapper
* @createDate 2022-08-29 14:23:17
* @Entity generator.domain.Cart
*/
@Mapper
@Repository
public interface CartMapper {

    public List<Cart> listCart(Cart cart) throws Exception;

    public int removeCart(Cart cart) throws Exception;

    @Insert("insert into cart values (null,#{foodId},#{businessId},#{userId},1)")
    public int saveCart(Cart cart) throws Exception;

    @Update("update cart set quantity = #{quantity} where foodId = #{foodId} and businessId = #{businessId} and userId = #{userId}")
    public int updateCart(Cart cart) throws Exception;

    public List<Cart> getUserId(Long userId) throws Exception;

    @Delete("DELETE FROM cart WHERE userId = #{userId}")
    public int delete(Long userId) throws Exception;
}
