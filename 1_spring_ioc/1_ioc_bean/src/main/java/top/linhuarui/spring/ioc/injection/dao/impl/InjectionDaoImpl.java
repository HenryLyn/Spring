package top.linhuarui.spring.ioc.injection.dao.impl;

import top.linhuarui.spring.ioc.injection.dao.InjectionDao;

/**
* @author LHR
* @date 2018/7/16
* @desc injection dao implement class.
*/
public class InjectionDaoImpl implements InjectionDao {
    /**
     * @param args
     * @author LHR
     * @date 2018/7/16
     * @desc save method.
     * @params [args]
     * @returns void
     */
    @Override
    public void save(String args) {
        System.out.println("save datums: " + args);
    }
}
