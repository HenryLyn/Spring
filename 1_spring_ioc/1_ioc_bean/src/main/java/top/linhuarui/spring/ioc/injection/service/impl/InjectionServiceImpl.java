package top.linhuarui.spring.ioc.injection.service.impl;

import top.linhuarui.spring.ioc.injection.dao.InjectionDao;
import top.linhuarui.spring.ioc.injection.dao.impl.InjectionDaoImpl;
import top.linhuarui.spring.ioc.injection.service.InjectionService;

/**
* @author LHR
* @date 2018/7/16
* @desc service implement class.
*/
public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc constructor injection
    * @params [injectionDao]
    * @returns
    */
    public InjectionServiceImpl (InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc set injection
    * @params [injectionDao]
    * @returns void
    */
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
