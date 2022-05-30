package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenpeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenpeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenpeixinxiView;


/**
 * 分配信息
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface FenpeixinxiService extends IService<FenpeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenpeixinxiVO> selectListVO(Wrapper<FenpeixinxiEntity> wrapper);
   	
   	FenpeixinxiVO selectVO(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
   	
   	List<FenpeixinxiView> selectListView(Wrapper<FenpeixinxiEntity> wrapper);
   	
   	FenpeixinxiView selectView(@Param("ew") Wrapper<FenpeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenpeixinxiEntity> wrapper);
   	

}

