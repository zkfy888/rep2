package cn.itcast.test;

import cn.itcast.service.AccountSevice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountSevice as = (AccountSevice) ac.getBean("accountService");
        //调用方法
        as.findAll();
    }
}
