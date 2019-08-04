package com.gree.ssm.service;

import com.gree.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll(int page,int size) throws Exception;

    List<Product> findByConditionList(int page,int size,String userID, String username, String userPost, String userWork);
}
