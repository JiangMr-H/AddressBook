/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Product
 * Author:   891649
 * Date:     2019/7/1 13:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.ssm.domain;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈产品信息〉
 *
 * @author 891649
 * @create 2019/7/1
 * @since 1.0.0
 */
public class Product {
//    private String id;
    private String 员工编号; //
    private String 员工姓名; //
    private String 单位; //
    private String 性别; //
    private String 岗位;
    private String 手机号码; //
    private String 工资体系; //
    private String 所属科室名称; //

    public String get员工编号() {
        return 员工编号;
    }

    public void set员工编号(String 员工编号) {
        this.员工编号 = 员工编号;
    }

    public String get员工姓名() {
        return 员工姓名;
    }

    public void set员工姓名(String 员工姓名) {
        this.员工姓名 = 员工姓名;
    }

    public String get单位() {
        return 单位;
    }

    public void set单位(String 单位) {
        this.单位 = 单位;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public String get岗位() {
        return 岗位;
    }

    public void set岗位(String 岗位) {
        this.岗位 = 岗位;
    }

    public String get手机() {
        return 手机号码;
    }

    public void set手机(String 手机) {
        this.手机号码 = 手机;
    }

    public String get工资体系() {
        return 工资体系;
    }

    public void set工资体系(String 工资体系) {
        this.工资体系 = 工资体系;
    }

    public String get所属科室名称() {
        return 所属科室名称;
    }

    public void set所属科室名称(String 所属科室名称) {
        this.所属科室名称 = 所属科室名称;
    }
}