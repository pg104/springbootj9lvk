package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerengaojianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerengaojianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerengaojianView;


/**
 * 个人稿件
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface GerengaojianService extends IService<GerengaojianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerengaojianVO> selectListVO(Wrapper<GerengaojianEntity> wrapper);
   	
   	GerengaojianVO selectVO(@Param("ew") Wrapper<GerengaojianEntity> wrapper);
   	
   	List<GerengaojianView> selectListView(Wrapper<GerengaojianEntity> wrapper);
   	
   	GerengaojianView selectView(@Param("ew") Wrapper<GerengaojianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerengaojianEntity> wrapper);
   	

}

