package top.linhuarui.spring.bean.annotation.autowired.baseautowired.dao.impl;

import org.springframework.stereotype.Repository;
import top.linhuarui.spring.bean.annotation.autowired.baseautowired.dao.InjectionDao;

/**
* @author LHR
* @date 2018/7/16
* @desc injection dao implement class.
*/
@Repository
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
