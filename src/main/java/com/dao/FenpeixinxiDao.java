package com.dao;

import com.entity.FenpeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenpeixinxiVO;
import com.entity.view.FenpeixinxiView;


/**
 * 分配信息
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface FenpeixinxiDao extends BaseMapper<FenpeixinxiEntity> {
	
	List<FenpeixinxiVO> selectListVO(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
	
	FenpeixinxiVO selectVO(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
	
	List<FenpeixinxiView> selectListView(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);

	List<FenpeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
	
	FenpeixinxiView selectView(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
	

}
