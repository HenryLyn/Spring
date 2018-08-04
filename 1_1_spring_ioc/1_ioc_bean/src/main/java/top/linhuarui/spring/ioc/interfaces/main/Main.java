package top.linhuarui.spring.ioc.interfaces.main;

import top.linhuarui.spring.ioc.interfaces.OneInterface;
import top.linhuarui.spring.ioc.interfaces.impl.OneInterfaceImpl;

/**
* @author LHR
* @date 2018/7/16
* @desc test interface
*/
public class Main {
    public static void main(String[] args) {

        OneInterface oIf = new OneInterfaceImpl();

        System.out.printf(oIf.hello("world"));
    }
}
