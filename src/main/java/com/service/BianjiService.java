package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianjiView;


/**
 * 编辑
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface BianjiService extends IService<BianjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianjiVO> selectListVO(Wrapper<BianjiEntity> wrapper);
   	
   	BianjiVO selectVO(@Param("ew") Wrapper<BianjiEntity> wrapper);
   	
   	List<BianjiView> selectListView(Wrapper<BianjiEntity> wrapper);
   	
   	BianjiView selectView(@Param("ew") Wrapper<BianjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianjiEntity> wrapper);
   	

}

