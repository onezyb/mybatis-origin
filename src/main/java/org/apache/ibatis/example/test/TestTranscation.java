package org.apache.ibatis.example.test;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.jupiter.api.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@Service
//@ContextConfiguration({"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml", "classpath:conf/spring-schedule.xml"})
//@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
public class TestTranscation {
//  @Test
  public static void main(String[] ass) {
    UpdateService updateService = new UpdateService();
    updateService.update(1);
  }

}
