package com.yu.test;

import com.yu.dao.OrdersMapper;
import com.yu.dao.UserMapper;
import com.yu.domain.Orders;
import com.yu.domain.OrdersExample;
import com.yu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    UserMapper umapper;
    @Autowired
    OrdersMapper omapper;
    @Test
    public void test(){
        OrdersExample e=new OrdersExample();
        List<Orders> orders = omapper.selectByExample(e);
       for (Orders o:orders){
           System.out.println(o.getNumber());
       }

    }
}
