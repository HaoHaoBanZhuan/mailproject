package com.tmeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tmeng.common.utils.PageUtils;
import com.tmeng.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author tim
 * @email 17721529285@gmail.com
 * @date 2023-03-19 23:10:00
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

