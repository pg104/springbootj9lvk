package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaojianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GaojianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GaojianxinxiView;


/**
 * 稿件信息
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface GaojianxinxiService extends IService<GaojianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaojianxinxiVO> selectListVO(Wrapper<GaojianxinxiEntity> wrapper);
   	
   	GaojianxinxiVO selectVO(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
   	
   	List<GaojianxinxiView> selectListView(Wrapper<GaojianxinxiEntity> wrapper);
   	
   	GaojianxinxiView selectView(@Param("ew") Wrapper<GaojianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaojianxinxiEntity> wrapper);
   	

}

