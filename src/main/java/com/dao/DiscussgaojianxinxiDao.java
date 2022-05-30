package com.dao;

import com.entity.DiscussgaojianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgaojianxinxiVO;
import com.entity.view.DiscussgaojianxinxiView;


/**
 * 稿件信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface DiscussgaojianxinxiDao extends BaseMapper<DiscussgaojianxinxiEntity> {
	
	List<DiscussgaojianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
	
	DiscussgaojianxinxiVO selectVO(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
	
	List<DiscussgaojianxinxiView> selectListView(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);

	List<DiscussgaojianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
	
	DiscussgaojianxinxiView selectView(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
	

}
