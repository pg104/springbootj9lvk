package com.dao;

import com.entity.GaojianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GaojianxinxiVO;
import com.entity.view.GaojianxinxiView;


/**
 * 稿件信息
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface GaojianxinxiDao extends BaseMapper<GaojianxinxiEntity> {
	
	List<GaojianxinxiVO> selectListVO(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
	
	GaojianxinxiVO selectVO(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
	
	List<GaojianxinxiView> selectListView(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);

	List<GaojianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
	
	GaojianxinxiView selectView(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
	

}
