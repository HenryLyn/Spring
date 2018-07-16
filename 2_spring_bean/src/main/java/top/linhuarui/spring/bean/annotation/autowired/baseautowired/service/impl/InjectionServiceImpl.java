package top.linhuarui.spring.bean.annotation.autowired.baseautowired.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.linhuarui.spring.bean.annotation.autowired.baseautowired.dao.InjectionDao;
import top.linhuarui.spring.bean.annotation.autowired.baseautowired.service.InjectionService;

/**
* @author LHR
* @date 2018/7/16
* @desc service implement class.
*/
@Service
public class InjectionServiceImpl implements InjectionService {

    //@Autowired
    private InjectionDao injectionDao;

    /**
     * @author LHR
     * @date 2018/7/16
     * @desc constructor injection
     * @params [injectionDao]
     * @returns
     */
    @Autowired
    public InjectionServiceImpl (InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc set injection dao
    * @params [injectionDao]
    * @returns void
    */
    //@Autowired
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    /**
     * @param arg
     * @author LHR
     * @date 2018/7/16
     * @desc save method.
     * @params [arg]
     * @returns void
     */
    @Override
    public void save(String arg) {
        System.out.println("Service get arg: " + arg);

        // processing data
        arg = arg + " : " + this.hashCode();
        injectionDao.save(arg);
    }
}
