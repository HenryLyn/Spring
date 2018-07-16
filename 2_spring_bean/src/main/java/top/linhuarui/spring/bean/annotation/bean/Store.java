package top.linhuarui.spring.bean.annotation.bean;

/**
* @author LHR
* @date 2018/7/16
* @desc store interface
*/
public interface Store<T> {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc this is init method
    * @params []
    * @returns void
    */
    void init();

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc this is destroy method
    * @params []
    * @returns void
    */
    void destroy();
}
