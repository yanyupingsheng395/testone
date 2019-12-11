package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.ibatis.cache.NullCacheKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

//    @Autowired
//    private DiscoveryClient client;
//
//
//
//    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
//    public boolean add(@RequestBody Dept dept)
//    {
//        return deptService.add(dept);
//    }

    @GetMapping(value="/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptService.get(id);
        if(dept==null){
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }

        return dept;
    }



    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptno(id)
                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }


}
