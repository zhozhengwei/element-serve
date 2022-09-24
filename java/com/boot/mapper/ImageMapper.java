package com.boot.mapper;

import com.boot.entity.Image;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface ImageMapper {
    @Insert("INSERT INTO image (imagePath) VALUES (#{imagePath})")
    public int addImage(Image image);

}
