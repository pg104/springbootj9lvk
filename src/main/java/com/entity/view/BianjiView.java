package com.entity.view;

import com.entity.BianjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 编辑
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
@TableName("bianji")
public class BianjiView  extends BianjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BianjiView(){
	}
 
 	public BianjiView(BianjiEntity bianjiEntity){
 	try {
			BeanUtils.copyProperties(this, bianjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
