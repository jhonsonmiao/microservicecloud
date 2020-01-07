package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ComponentScan("com.atguigu.springcloud.*")
public class DeptProvider8001_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
