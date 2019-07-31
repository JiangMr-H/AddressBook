package com.gree.ssm.service;

import com.gree.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;
}
