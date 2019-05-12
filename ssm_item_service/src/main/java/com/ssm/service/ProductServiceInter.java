package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Products;

public interface ProductServiceInter {

	List<Products> findAllPros();

	Products findOne(Integer id);

	void update(Products p);
}
