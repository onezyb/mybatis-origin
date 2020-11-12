package org.apache.ibatis.example.test;

import org.apache.ibatis.example.mapper.UserMapper;
import org.apache.ibatis.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.Reader;

public class SaveService {

  @Transactional
  public  void save(SqlSession session) {
//    String resource = "Configuration.xml";//org/apache/ibatis/example/
//    Reader reader;
//    try {
//      reader = Resources.getResourceAsReader(resource);
//      SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//      SqlSession session = sessionFactory.openSession();
      UserMapper userMapper = session.getMapper(UserMapper.class);
      userMapper.saveOne();
//      session.close();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
