package top.linhuarui.spring.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;

/**
* @author LHR
* @date 2018/7/16
* @desc application context aware practice
*/
public class ApplicationContext implements ApplicationContextAware {

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext: " + applicationContext.getBean("applicationContext").hashCode());
    }
}
