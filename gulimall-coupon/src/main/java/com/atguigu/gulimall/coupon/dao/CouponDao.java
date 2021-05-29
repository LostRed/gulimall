package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lostred
 * @email lostred@outlook.com
 * @date 2021-05-29 17:51:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
