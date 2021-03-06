package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: microservicecloud
 * @description: 部门接口实现类
 * @author: mxk
 * @create: 2020-01-02 00:20
 **/
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept)
    {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptDao.findAll();
    }
}
