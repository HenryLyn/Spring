package top.linhuarui.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
* @author LHR
* @date 2018/7/16
* @desc bean life cycle practice.
*/
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    // below for default init and destroy
    /**
    * @author LHR
    * @date 2018/7/16
    * @desc default init method.
    * @params []
    * @returns void
    */
    public void defaultInit () {
        System.out.println("Bean defaultInit.");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc default destroy method
    * @params []
    * @returns void
    */
    public void defaultDestroy () {
        System.out.println("Bean defaultDestroy.");
    }

    // below for implements InitializingBean, DisposableBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean afterPropertiesSet.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy.");
    }

    // below for configuration in bean xml
    /**
    * @author LHR
    * @date 2018/7/16
    * @desc start method.
    * @params []
    * @returns void
    */
    public void start () {
        System.out.println("Bean start.");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc stop method.
    * @params []
    * @returns void
    */
    public void stop () {
        System.out.println("Bean stop.");
    }

}
