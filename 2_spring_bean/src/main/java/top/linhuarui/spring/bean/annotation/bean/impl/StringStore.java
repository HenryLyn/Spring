package top.linhuarui.spring.bean.annotation.bean.impl;

import top.linhuarui.spring.bean.annotation.bean.Store;

/**
* @author LHR
* @date 2018/7/16
* @desc string store implement
*/
public class StringStore implements Store<String> {

    public void init () {
        System.out.println("This is init...");
    }

    public void destroy () {
        System.out.println("This is destroy...");
    }
}
