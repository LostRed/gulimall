package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lostred
 * @email lostred@outlook.com
 * @date 2021-05-16 17:52:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
