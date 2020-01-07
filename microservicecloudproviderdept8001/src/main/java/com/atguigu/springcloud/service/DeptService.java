package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @program: microservicecloud
 * @description: 部门服务接口
 * @author: mxk
 * @create: 2020-01-02 00:18
 **/
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
