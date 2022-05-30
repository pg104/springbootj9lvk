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


import com.dao.FenpeixinxiDao;
import com.entity.FenpeixinxiEntity;
import com.service.FenpeixinxiService;
import com.entity.vo.FenpeixinxiVO;
import com.entity.view.FenpeixinxiView;

@Service("fenpeixinxiService")
public class FenpeixinxiServiceImpl extends ServiceImpl<FenpeixinxiDao, FenpeixinxiEntity> implements FenpeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenpeixinxiEntity> page = this.selectPage(
                new Query<FenpeixinxiEntity>(params).getPage(),
                new EntityWrapper<FenpeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenpeixinxiEntity> wrapper) {
		  Page<FenpeixinxiView> page =new Query<FenpeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenpeixinxiVO> selectListVO(Wrapper<FenpeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenpeixinxiVO selectVO(Wrapper<FenpeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenpeixinxiView> selectListView(Wrapper<FenpeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenpeixinxiView selectView(Wrapper<FenpeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
