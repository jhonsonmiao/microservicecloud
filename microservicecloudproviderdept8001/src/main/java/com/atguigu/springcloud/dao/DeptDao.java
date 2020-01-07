package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: microservicecloud
 * @description: 部门表dao
 * @author: mxk
 * @create: 2020-01-02 00:15
 **/

@Mapper
public interface  DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
