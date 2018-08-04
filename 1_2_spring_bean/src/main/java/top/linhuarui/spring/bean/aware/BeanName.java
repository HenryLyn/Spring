package top.linhuarui.spring.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
* @author LHR
* @date 2018/7/16
* @desc bean name aware practice.
*/
public class BeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc override set bean name.
    * @params [s]
    * @returns void
    */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("BeanName: " + name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext: " + applicationContext.getBean(this.beanName).hashCode());
    }
}
