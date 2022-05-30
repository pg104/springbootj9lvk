package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GerengaojianEntity;
import com.entity.view.GerengaojianView;

import com.service.GerengaojianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 个人稿件
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
@RestController
@RequestMapping("/gerengaojian")
public class GerengaojianController {
    @Autowired
    private GerengaojianService gerengaojianService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GerengaojianEntity gerengaojian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuozhe")) {
			gerengaojian.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GerengaojianEntity> ew = new EntityWrapper<GerengaojianEntity>();
		PageUtils page = gerengaojianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gerengaojian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GerengaojianEntity gerengaojian, 
		HttpServletRequest request){
        EntityWrapper<GerengaojianEntity> ew = new EntityWrapper<GerengaojianEntity>();
		PageUtils page = gerengaojianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gerengaojian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GerengaojianEntity gerengaojian){
       	EntityWrapper<GerengaojianEntity> ew = new EntityWrapper<GerengaojianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gerengaojian, "gerengaojian")); 
        return R.ok().put("data", gerengaojianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GerengaojianEntity gerengaojian){
        EntityWrapper< GerengaojianEntity> ew = new EntityWrapper< GerengaojianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gerengaojian, "gerengaojian")); 
		GerengaojianView gerengaojianView =  gerengaojianService.selectView(ew);
		return R.ok("查询个人稿件成功").put("data", gerengaojianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GerengaojianEntity gerengaojian = gerengaojianService.selectById(id);
        return R.ok().put("data", gerengaojian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GerengaojianEntity gerengaojian = gerengaojianService.selectById(id);
        return R.ok().put("data", gerengaojian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GerengaojianEntity gerengaojian, HttpServletRequest request){
    	gerengaojian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gerengaojian);
        gerengaojianService.insert(gerengaojian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GerengaojianEntity gerengaojian, HttpServletRequest request){
    	gerengaojian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gerengaojian);
        gerengaojianService.insert(gerengaojian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GerengaojianEntity gerengaojian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gerengaojian);
        gerengaojianService.updateById(gerengaojian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gerengaojianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GerengaojianEntity> wrapper = new EntityWrapper<GerengaojianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuozhe")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gerengaojianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
