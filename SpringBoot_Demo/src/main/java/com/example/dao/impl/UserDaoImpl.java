package com.example.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.example.dao.UserDao;
import com.example.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//数据访问操作

//@Component
//控制反转 将UserDaoImpl实现类对象的创建控制权交给容器管理 加在实现类上而非接口上
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> findall() {
        //1.加载并读取user.txt文件，获取用户数据
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
