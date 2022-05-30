package com.dao;

import com.entity.GerengaojianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerengaojianVO;
import com.entity.view.GerengaojianView;


/**
 * 个人稿件
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface GerengaojianDao extends BaseMapper<GerengaojianEntity> {
	
	List<GerengaojianVO> selectListVO(@Param("ew") Wrapper<GerengaojianEntity> wrapper);
	
	GerengaojianVO selectVO(@Param("ew") Wrapper<GerengaojianEntity> wrapper);
	
	List<GerengaojianView> selectListView(@Param("ew") Wrapper<GerengaojianEntity> wrapper);

	List<GerengaojianView> selectListView(Pagination page,@Param("ew") Wrapper<GerengaojianEntity> wrapper);
	
	GerengaojianView selectView(@Param("ew") Wrapper<GerengaojianEntity> wrapper);
	

}
