/**
 * Copyright ${license.git.copyrightYears} the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.example;

import org.apache.ibatis.example.mapper.UserMapper;
import org.apache.ibatis.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by selina on 2018/4/3.
 */
public class MybatisHelloWorld {
  public static void main(String[] args) {
    String resource = "Configuration.xml";//org/apache/ibatis/example/
    Reader reader;
    try {
      reader = Resources.getResourceAsReader(resource);
      SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
      SqlSession session = sessionFactory.openSession();
      User user;
//      user = session.selectOne("org.apache.ibatis.example.mapper.UserMapper.getUser", 1);
      UserMapper userMapper = session.getMapper(UserMapper.class);
      user = userMapper.getUser(1);

      System.out.println(user.getLfPartyId() + "," + user.getPartyName());
      session.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
