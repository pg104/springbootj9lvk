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


import com.dao.GerengaojianDao;
import com.entity.GerengaojianEntity;
import com.service.GerengaojianService;
import com.entity.vo.GerengaojianVO;
import com.entity.view.GerengaojianView;

@Service("gerengaojianService")
public class GerengaojianServiceImpl extends ServiceImpl<GerengaojianDao, GerengaojianEntity> implements GerengaojianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerengaojianEntity> page = this.selectPage(
                new Query<GerengaojianEntity>(params).getPage(),
                new EntityWrapper<GerengaojianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerengaojianEntity> wrapper) {
		  Page<GerengaojianView> page =new Query<GerengaojianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerengaojianVO> selectListVO(Wrapper<GerengaojianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerengaojianVO selectVO(Wrapper<GerengaojianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerengaojianView> selectListView(Wrapper<GerengaojianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerengaojianView selectView(Wrapper<GerengaojianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
