package org.apache.ibatis.example.test;

import org.apache.ibatis.example.mapper.UserMapper;
import org.apache.ibatis.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

import org.springframework.transaction.annotation.Transactional;

public class UpdateService {

//  @Transactional
  public void update(int id) {
    String resource = "Configuration.xml";//org/apache/ibatis/example/
    Reader reader = null;
    try {
      reader = Resources.getResourceAsReader(resource);
    } catch (IOException e) {
      e.printStackTrace();
    }
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    UserMapper userMapper = session.getMapper(UserMapper.class);
    System.out.println(userMapper.updateOne(id));
    session.commit();
//    int a = 1/0;
    //
//    SaveService saveService = new SaveService();
//    saveService.save(session);
    session.close();


  }

}
