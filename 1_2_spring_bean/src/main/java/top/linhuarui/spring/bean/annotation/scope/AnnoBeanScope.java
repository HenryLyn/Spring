package top.linhuarui.spring.bean.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
* @author LHR
* @date 2018/7/16
* @desc Test @Component
*/
//@Component("beanName")
//@Scope("prototype") // bean scope
@Scope
@Component
public class AnnoBeanScope {

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc say
    * @params [world]
    * @returns void
    */
    public void say (String world) {
        System.out.println("AnnoBeanScope: " + world);
    }
}
