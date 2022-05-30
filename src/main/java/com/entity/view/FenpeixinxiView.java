package com.entity.view;

import com.entity.FenpeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分配信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
@TableName("fenpeixinxi")
public class FenpeixinxiView  extends FenpeixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenpeixinxiView(){
	}
 
 	public FenpeixinxiView(FenpeixinxiEntity fenpeixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fenpeixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
