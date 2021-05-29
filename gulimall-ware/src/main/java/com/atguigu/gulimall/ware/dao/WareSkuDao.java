package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lostred
 * @email lostred@outlook.com
 * @date 2021-05-29 17:54:32
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
