package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 编辑
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-07 16:30:28
 */
@TableName("bianji")
public class BianjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BianjiEntity() {
		
	}
	
	public BianjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编辑账号
	 */
					
	private String bianjizhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 编辑姓名
	 */
					
	private String bianjixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 相片
	 */
					
	private String xiangpian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编辑账号
	 */
	public void setBianjizhanghao(String bianjizhanghao) {
		this.bianjizhanghao = bianjizhanghao;
	}
	/**
	 * 获取：编辑账号
	 */
	public String getBianjizhanghao() {
		return bianjizhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：编辑姓名
	 */
	public void setBianjixingming(String bianjixingming) {
		this.bianjixingming = bianjixingming;
	}
	/**
	 * 获取：编辑姓名
	 */
	public String getBianjixingming() {
		return bianjixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：相片
	 */
	public void setXiangpian(String xiangpian) {
		this.xiangpian = xiangpian;
	}
	/**
	 * 获取：相片
	 */
	public String getXiangpian() {
		return xiangpian;
	}

}
