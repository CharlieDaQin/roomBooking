package com.roombooking.demo.dao;

import com.roombooking.demo.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath:applicationContext-core.xml"
        ,"classpath:applicationContext-jpa.xml"
})
@Transactional
public class IOrderDaoTest {
    @Autowired
    private IOrderDao iOrderDao;

@Test
@Rollback
public void saveTest(){
        Order order = new Order();
        order.setOrderNo(12356);

        iOrderDao.save(order);
    }
}