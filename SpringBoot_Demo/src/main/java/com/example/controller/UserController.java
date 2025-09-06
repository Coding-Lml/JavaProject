package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//接收请求，响应数据

@RestController //请求处理类 处理http请求 自动将返回的对象转为json格式
//ResController = Component + ResponseBody  ResponseBody 代表请求处理类 Component代表IOC控制反转使用容器管理Bean

public class UserController {
//    @RequestMapping("/list") //标识请求路径
//    public List<User> list() throws FileNotFoundException {
//        //1.加载并读取user.txt文件，获取用户数据
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
//        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
//        System.out.println(lines.size());
//        //2.解析用户信息，封装为User对象 -> list集合
//        List<User> userList = lines.stream().map(
//                (String line) ->{
//                    String[] split = line.split(",");
//                    Integer id = Integer.parseInt(split[0]);
//                    String name = split[3];
//                    String username = split[1];
//                    String password = split[2];
//                    Integer age = Integer.parseInt(split[4]);
//                    LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//                    return new User(id, username, password, name, age, updateTime);
//                }
//        ).collect(Collectors.toList());
//
//        //3.返回数据（json）会自动转为json
//        return userList;

//    private UserService userService = new UserServiceImpl();

    @Autowired //DI 依赖注入 会自动查询该类型的bean对象 并赋值给该成员变量
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        // 调用service 获取数据
        List<User> userList = userService.findall();

        //返回数据 转为json
        return userList;
    }


}
