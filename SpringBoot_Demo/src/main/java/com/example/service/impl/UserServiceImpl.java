package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

//业务逻辑处理

//@Component
//IOC 控制反转 将UserServiceImpl对象创建控制权交给容器管理 加在实现类上而非接口
@Service
public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();

    @Autowired //DI 依赖注入 属性注入 注入运行时所依赖的对象
    private UserDao userDao;

//    private final UserDao userDao;
//    @Autowired // 构造器注入
//    public UserServiceImpl(UserDao userDao){
//        this.userDao = userDao;
//    }

//    private final UserDao userDao;
//    @Autowired  setter注入
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }




    @Override
    public List<User> findall() {
        //1.调用DAO
        List<String> lines = userDao.findall();

        //2.解析用户信息，封装为User对象 -> list集合
        List<User> userList = lines.stream().map(
                (String line) ->{
                    String[] split = line.split(",");
                    Integer id = Integer.parseInt(split[0]);
                    String name = split[3];
                    String username = split[1];
                    String password = split[2];
                    Integer age = Integer.parseInt(split[4]);
                    LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    return new User(id, username, password, name, age, updateTime);
                }
        ).collect(Collectors.toList());

        return userList;
    }
}
