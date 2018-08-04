package top.linhuarui.spring.bean.beanscope;

/**
* @author LHR
* @date 2018/7/16
* @desc bean scope practice.
*/
public class BeanScope {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc say.
    * @params []
    * @returns void
    */
    public void say () {
        System.out.println("BeanScope say : " + this.hashCode());
    }
}
