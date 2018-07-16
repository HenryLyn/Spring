package top.linhuarui.spring.bean.annotation.jsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
* @author LHR
* @date 2018/7/16
* @desc jsr service
*/
//@Service
@Named
public class JsrService {

    //@Resource
//    @Inject
    private JsrDAO jsrDAO;

//    @Resource
    @Inject
    public void setJsrDAO(@Named(value = "jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc save method.
    * @params []
    * @returns void
    */
    public void save () {
        jsrDAO.save();
    }

    @PostConstruct
    public void init () {
        System.out.println("JsrService init...");
    }

    @PreDestroy
    public void destroy () {
        System.out.println("JsrService destroy...");
    }


}
