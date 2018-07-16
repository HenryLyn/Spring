package top.linhuarui.spring.bean.annotation.bean.impl;

public class MyDriverManager {

    public MyDriverManager (String url, String userName, String password) {
        System.out.println("url: " + url);
        System.out.println("user name: " + userName);
        System.out.println("password: " + password);
    }

}
