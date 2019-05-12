package com.ssm.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ssm.pojo.Products;
import com.ssm.service.ProductServiceInter;

@Controller
@RequestMapping("/pro")
public class ProductController {

	@Autowired
	private ProductServiceInter productServiceInter;

	@RequestMapping("/all")
	public String selectUser(Model model) {
		List<Products> pros = productServiceInter.findAllPros();
		model.addAttribute("pros", pros);
		return "product";
	}

	@RequestMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		Products pro = productServiceInter.findOne(id);
		model.addAttribute("pro", pro);
		return "product_update";
	}

	// 商品修改提交
	@RequestMapping("/doUpdate")
		public String doUpdate(Products p, MultipartFile pictureFile)throws Exception{
			
			//原始文件名称
			String pictureFile_name =  pictureFile.getOriginalFilename();
			//新文件名称
			String newFileName = UUID.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
			
			//上传图片
			File uploadPic = new File("D:/img/"+newFileName);
			
			if(!uploadPic.exists()){
				uploadPic.mkdirs();
			}
			//向磁盘写文件
			pictureFile.transferTo(uploadPic);
			
			//保存更改
			p.setPic(newFileName);
			productServiceInter.update(p);
			
			return "redirect:/pro/all";
			
	}



}
