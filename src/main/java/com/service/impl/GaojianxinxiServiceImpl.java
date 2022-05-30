package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GaojianxinxiDao;
import com.entity.GaojianxinxiEntity;
import com.service.GaojianxinxiService;
import com.entity.vo.GaojianxinxiVO;
import com.entity.view.GaojianxinxiView;

@Service("gaojianxinxiService")
public class GaojianxinxiServiceImpl extends ServiceImpl<GaojianxinxiDao, GaojianxinxiEntity> implements GaojianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaojianxinxiEntity> page = this.selectPage(
                new Query<GaojianxinxiEntity>(params).getPage(),
                new EntityWrapper<GaojianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaojianxinxiEntity> wrapper) {
		  Page<GaojianxinxiView> page =new Query<GaojianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaojianxinxiVO> selectListVO(Wrapper<GaojianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaojianxinxiVO selectVO(Wrapper<GaojianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaojianxinxiView> selectListView(Wrapper<GaojianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaojianxinxiView selectView(Wrapper<GaojianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
