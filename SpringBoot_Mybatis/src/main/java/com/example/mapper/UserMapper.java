package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //应用程序运行时会自动为接口创建一个实现类对象并自动存入IOC容器
public interface UserMapper {
//    @Select("select * from user")
    public List<User> findAll();

    @Insert("insert into user (username,password,name,age) values(#{username},#{password},#{name},#{age})")
    public void insert(User user);

    @Delete("delete from user where id = #{id}")
    public void deleteById(int id);

    @Update("update user set name = #{username} where id = #{id}")
    public void update(User user);

    @Select("select * from user where password = #{password} and username = #{username}")
    public List<User> find(@Param("password") String ps, @Param("username") String us);
}
