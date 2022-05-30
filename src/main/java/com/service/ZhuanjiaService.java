package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiaView;


/**
 * 专家
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
public interface ZhuanjiaService extends IService<ZhuanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiaVO> selectListVO(Wrapper<ZhuanjiaEntity> wrapper);
   	
   	ZhuanjiaVO selectVO(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
   	
   	List<ZhuanjiaView> selectListView(Wrapper<ZhuanjiaEntity> wrapper);
   	
   	ZhuanjiaView selectView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiaEntity> wrapper);
   	

}

