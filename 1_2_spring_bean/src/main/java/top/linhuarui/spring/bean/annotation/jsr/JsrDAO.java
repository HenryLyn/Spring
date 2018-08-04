package top.linhuarui.spring.bean.annotation.jsr;

import org.springframework.stereotype.Repository;

/**
* @author LHR
* @date 2018/7/16
* @desc jsr dao
*/
@Repository
public class JsrDAO {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc jsr save method.
    * @params []
    * @returns void
    */
    public void save () {
        System.out.println("jsr dao save.");
    }

}
