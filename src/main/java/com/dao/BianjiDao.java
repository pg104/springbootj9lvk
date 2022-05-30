package com.dao;

import com.entity.BianjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianjiVO;
import com.entity.view.BianjiView;


/**
 * 编辑
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface BianjiDao extends BaseMapper<BianjiEntity> {
	
	List<BianjiVO> selectListVO(@Param("ew") Wrapper<BianjiEntity> wrapper);
	
	BianjiVO selectVO(@Param("ew") Wrapper<BianjiEntity> wrapper);
	
	List<BianjiView> selectListView(@Param("ew") Wrapper<BianjiEntity> wrapper);

	List<BianjiView> selectListView(Pagination page,@Param("ew") Wrapper<BianjiEntity> wrapper);
	
	BianjiView selectView(@Param("ew") Wrapper<BianjiEntity> wrapper);
	

}
