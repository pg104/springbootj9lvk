package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgaojianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgaojianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgaojianxinxiView;


/**
 * 稿件信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface DiscussgaojianxinxiService extends IService<DiscussgaojianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgaojianxinxiVO> selectListVO(Wrapper<DiscussgaojianxinxiEntity> wrapper);
   	
   	DiscussgaojianxinxiVO selectVO(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
   	
   	List<DiscussgaojianxinxiView> selectListView(Wrapper<DiscussgaojianxinxiEntity> wrapper);
   	
   	DiscussgaojianxinxiView selectView(@Param("ew") Wrapper<DiscussgaojianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgaojianxinxiEntity> wrapper);
   	

}

