package com.tmeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tmeng.common.utils.PageUtils;
import com.tmeng.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author tim
 * @email 17721529285@gmail.com
 * @date 2023-03-19 23:10:00
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

