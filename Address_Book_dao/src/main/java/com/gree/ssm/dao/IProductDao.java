package com.gree.ssm.dao;

import com.gree.ssm.domain.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
     //查询所有的产品信息
    @Select("select 员工编号,员工姓名,所属部门名称 as 单位,性别,所属岗位 as 岗位,手机号码,工资体系,所属科室名称 from JD_员工表 where 用工关系状态='正式员工'")
    List<Product> findAll()throws Exception;

@Select({"<script>",
        "select 员工编号,员工姓名,所属部门名称 as 单位,性别,所属岗位 as 岗位,手机号码,工资体系,所属科室名称 from JD_员工表",
        "where 1=1" ,
        "<when test='userID!=null and userID!=\"\"'>",
        "and 员工编号=#{userID}",
        "</when>",
        "<when test='username!=null and username!=\"\"'>",
        "and 员工姓名=#{username}",
        "</when>",
        "<when test='userPost!=null and userPost!=\"\"'>",
        "and 所属岗位=#{userPost}",
        "</when>",
        "<when test='userWork!=null and userWork!=\"\"'>",
        "and 所属科室名称=#{userWork}",
        "</when>",
        "</script>"})
List<Product> findByConditionList(@Param("userID") String userID, @Param("username") String username, @Param("userPost") String userPost, @Param("userWork") String userWork);

    @Select({"<script>",
            "select 员工编号,员工姓名,所属部门名称 as 单位,性别,所属岗位 as 岗位,手机号码,工资体系,所属科室名称 from JD_员工表",
            "where 1=1" ,
            "<when test='userID!=null and userID!=\"\"'>",
            "and 员工编号=#{userID}",
            "</when>",
            "<when test='username!=null and username!=\"\"'>",
            "and 员工姓名=#{username}",
            "</when>",
            "<when test='userPost!=null and userPost!=\"\"'>",
            "and 所属岗位=#{userPost}",
            "</when>",
            "<when test='userWork!=null and userWork!=\"\"'>",
            "and 所属科室名称=#{userWork}",
            "</when>",
            "</script>"})
    Product findByCondition(@Param("userID") String userID, @Param("username") String username, @Param("userPost") String userPost, @Param("userWork") String userWork);
}
