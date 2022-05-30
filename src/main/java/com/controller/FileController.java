package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ConfigEntity;
import com.entity.EIException;
import com.service.ConfigService;
import com.utils.R;

/**
 * 上传文件映射表
 */
@RestController
@RequestMapping("file")
@SuppressWarnings({"unchecked","rawtypes"})
public class FileController{
	@Autowired
    private ConfigService configService;
	/**
	 * 上传文件
	 * 先创建一个临时文件并保存到本地，
	 * 然后调用MultipartFile.transferTo()方法，
	 * 将MultipartFile类型的文件转化为File类型的文件。
	 */
	@RequestMapping("/upload")
	public R upload(@RequestParam("file") MultipartFile file) throws Exception {
		if (file.isEmpty()) {
			throw new EIException("上传文件不能为空");
		}
		//获取文件后缀名
		String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
		//Spring 提供了一个 ResourceUtils 工具类，它支持“classpath:”和“file:”的地址前缀，它能够从指定的地址加载文件资源
		//获取文件的相对路径
		File path = new File(ResourceUtils.getURL("classpath:static").getPath());
		//如果目录不存在就创建
		if(!path.exists()) {
		    path = new File("");
		}
		//根据父目录(path的绝对路径)以及子目录(/upload)获取上传的路径
		File upload = new File(path.getAbsolutePath(),"/upload/");
		//路径不存在就创建
		if(!upload.exists()) {
		    upload.mkdirs();
		}
		//用当前系统的时间加上文件的后缀名（fileExt）组成新的文件
		String fileName = new Date().getTime()+"."+fileExt;
		File dest = new File(upload.getAbsolutePath()+"/"+fileName);
		//transferto()方法，是springmvc封装的方法，用于上传时，把内存中文件写入磁盘
		//将文件保存到指定位置(dest)
		file.transferTo(dest);
		//复制文件到磁盘上
		FileUtils.copyFile(dest, new File("src/main/resources/static/upload"+"/"+fileName));
		return R.ok().put("file", fileName);
	}
	
	/**
	 * 下载文件
	 * 下载byte[]流,返回下载链接
	 * 浏览器获得⽂件是通过http协议的，
	 * 所以只要设置好请求（request）返回的响应（response）的⼀些信息就⾏了，
	 * 设置响应（response）头的⼀些信息。
	 * 注意：ajax请求无法响应下载功能因为response原因，
	 * 一般请求浏览器是会处理服务器输出的response，
	 * 例如生成png、文件下载等,
	 * 然而ajax请求只是个“字符型”的请求，
	 * 即请求的内容是以文本类型存放的。
	 * 文件的下载是以二进制形式进行的，
	 * 虽然可以读取到返回的response，
	 * 但只是读取而已，是无法执行的，
	 * 说白点就是js无法调用到浏览器的下载处理机制和程序。
	 */
	@IgnoreAuth
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(@RequestParam String fileName) {
		try {
			File path = new File(ResourceUtils.getURL("classpath:static").getPath());
			if(!path.exists()) {
			    path = new File("");
			}
			File upload = new File(path.getAbsolutePath(),"/upload/");
			if(!upload.exists()) {
			    upload.mkdirs();
			}
			//获取文件
			File file = new File(upload.getAbsolutePath()+"/"+fileName);
			if(file.exists()){
				//设置header
				HttpHeaders headers = new HttpHeaders();
				//application/octet-stream二进制流数据（最常见的文件下载）
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				//通知浏览器以attachment（下载方式） 下载文件，文件名称为指定名称
			    headers.setContentDispositionFormData("attachment", fileName);
				//返回文件下载相关参数
				//FileUtils.readFileToByteArray => 读取目标文件,返回文件内容的bytes数组
				//响应头、响应体、响应状态
			    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
