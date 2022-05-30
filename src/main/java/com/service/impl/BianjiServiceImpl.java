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


import com.dao.BianjiDao;
import com.entity.BianjiEntity;
import com.service.BianjiService;
import com.entity.vo.BianjiVO;
import com.entity.view.BianjiView;

@Service("bianjiService")
public class BianjiServiceImpl extends ServiceImpl<BianjiDao, BianjiEntity> implements BianjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianjiEntity> page = this.selectPage(
                new Query<BianjiEntity>(params).getPage(),
                new EntityWrapper<BianjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianjiEntity> wrapper) {
		  Page<BianjiView> page =new Query<BianjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianjiVO> selectListVO(Wrapper<BianjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianjiVO selectVO(Wrapper<BianjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianjiView> selectListView(Wrapper<BianjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianjiView selectView(Wrapper<BianjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
