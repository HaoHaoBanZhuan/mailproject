package com.tmeng.gulimall.product.dao;

import com.tmeng.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tim
 * @email 17721529285@gmail.com
 * @date 2023-03-19 23:10:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
