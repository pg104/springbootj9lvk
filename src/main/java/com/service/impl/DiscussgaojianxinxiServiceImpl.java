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


import com.dao.DiscussgaojianxinxiDao;
import com.entity.DiscussgaojianxinxiEntity;
import com.service.DiscussgaojianxinxiService;
import com.entity.vo.DiscussgaojianxinxiVO;
import com.entity.view.DiscussgaojianxinxiView;

@Service("discussgaojianxinxiService")
public class DiscussgaojianxinxiServiceImpl extends ServiceImpl<DiscussgaojianxinxiDao, DiscussgaojianxinxiEntity> implements DiscussgaojianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgaojianxinxiEntity> page = this.selectPage(
                new Query<DiscussgaojianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgaojianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgaojianxinxiEntity> wrapper) {
		  Page<DiscussgaojianxinxiView> page =new Query<DiscussgaojianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgaojianxinxiVO> selectListVO(Wrapper<DiscussgaojianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgaojianxinxiVO selectVO(Wrapper<DiscussgaojianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgaojianxinxiView> selectListView(Wrapper<DiscussgaojianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgaojianxinxiView selectView(Wrapper<DiscussgaojianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
