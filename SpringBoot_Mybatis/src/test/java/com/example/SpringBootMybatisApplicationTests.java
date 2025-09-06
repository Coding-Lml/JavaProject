package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest //SpringBoot单元测试的注解
class SpringBootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindALl(){
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setName("管理员");
        user.setAge(18);
        userMapper.insert(user);
    }

    @Test
    public void testDeleteById(){
        userMapper.deleteById(1);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUsername("管理员1号");
        user.setId(6);
        userMapper.update(user);
    }

    @Test
    public void testFindUserById(){
        List<User> list = userMapper.find("123456","管理员1号");
        list.forEach(System.out::println);
    }
}
