package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lostred
 * @email lostred@outlook.com
 * @date 2021-05-29 17:53:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
