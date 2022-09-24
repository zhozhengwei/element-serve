package com.boot.service.Impl;

import com.boot.entity.Image;
import com.boot.mapper.ImageMapper;
import com.boot.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public int addImage(Image image) {
        return imageMapper.addImage(image);
    }
}
