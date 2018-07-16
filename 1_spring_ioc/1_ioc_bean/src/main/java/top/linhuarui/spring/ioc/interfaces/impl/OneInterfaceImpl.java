package top.linhuarui.spring.ioc.interfaces.impl;

import top.linhuarui.spring.ioc.interfaces.OneInterface;

/**
* @author LHR
* @date 2018/7/16
* @desc a interface implement.
*/
public class OneInterfaceImpl implements OneInterface {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc a hello method
    * @params [world]
    * @returns java.lang.String
    */
    @Override
    public String hello(String world) {
        return "Word from interface 'OneInterface': " + world;
    }
}
