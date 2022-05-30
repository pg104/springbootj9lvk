package com.entity.view;

import com.entity.DiscussgaojianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 稿件信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
@TableName("discussgaojianxinxi")
public class DiscussgaojianxinxiView  extends DiscussgaojianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgaojianxinxiView(){
	}
 
 	public DiscussgaojianxinxiView(DiscussgaojianxinxiEntity discussgaojianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussgaojianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
