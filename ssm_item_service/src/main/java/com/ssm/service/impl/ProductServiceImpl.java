package com.ssm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ProductMapper;
import com.ssm.pojo.Products;
import com.ssm.service.ProductServiceInter;
@Service
public class ProductServiceImpl  implements ProductServiceInter{

	@Autowired
	private ProductMapper productMapper;
	
	public List<Products> findAllPros() {
		return productMapper.findAllPros();
	}

	public Products findOne(Integer id) {
		return productMapper.findOne(id);
	}

	public void update(Products p) {
		
		productMapper.update(p);
	}

}
