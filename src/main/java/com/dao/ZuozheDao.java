package com.dao;

import com.entity.ZuozheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuozheVO;
import com.entity.view.ZuozheView;


/**
 * 作者
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface ZuozheDao extends BaseMapper<ZuozheEntity> {
	
	List<ZuozheVO> selectListVO(@Param("ew") Wrapper<ZuozheEntity> wrapper);
	
	ZuozheVO selectVO(@Param("ew") Wrapper<ZuozheEntity> wrapper);
	
	List<ZuozheView> selectListView(@Param("ew") Wrapper<ZuozheEntity> wrapper);

	List<ZuozheView> selectListView(Pagination page,@Param("ew") Wrapper<ZuozheEntity> wrapper);
	
	ZuozheView selectView(@Param("ew") Wrapper<ZuozheEntity> wrapper);
	

}
