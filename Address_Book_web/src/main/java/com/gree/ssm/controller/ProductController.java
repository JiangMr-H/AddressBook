/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProductController
 * Author:   891649
 * Date:     2019/7/1 14:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.ssm.controller;

import com.github.pagehelper.PageInfo;

import com.gree.ssm.domain.Product;
import com.gree.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/7/1
 * @since 1.0.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Product> productList = iProductService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(productList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");
        return mv;
    }

    @RequestMapping("/findByCondition.do")
    @ResponseBody
   public ModelAndView findByConditionList(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size,
                                           String userID, String username, String userPost, String userWork)throws Exception{
        ModelAndView mv =new ModelAndView();
        List<Product> productList =iProductService.findByConditionList(page,size,userID,username,userPost,userWork);
        PageInfo pageInfo = new PageInfo(productList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("Query-list");
        return mv;
    }


}