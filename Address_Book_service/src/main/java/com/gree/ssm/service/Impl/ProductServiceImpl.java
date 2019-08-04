/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProductServiceImpl
 * Author:   891649
 * Date:     2019/7/1 14:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.ssm.service.Impl;

import com.github.pagehelper.PageHelper;
import com.gree.ssm.dao.IProductDao;
import com.gree.ssm.domain.Product;
import com.gree.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/1
 * @since 1.0.0
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return iProductDao.findAll();
    }

    @Override
    public List<Product> findByConditionList(int page,int size,String userID, String username, String userPost, String userWork) {
        PageHelper.startPage(page,size);
        return iProductDao.findByConditionList(userID,username,userPost,userWork);
    }

}