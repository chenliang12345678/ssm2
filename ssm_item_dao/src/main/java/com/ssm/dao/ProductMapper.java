package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Products;

public interface ProductMapper {

	List<Products> findAllPros();

	Products findOne(Integer id);

	void update(Products p);
}
