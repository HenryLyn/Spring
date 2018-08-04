package top.linhuarui.spring.bean.annotation.autowired.multibean.invoker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import top.linhuarui.spring.bean.annotation.autowired.multibean.BeanInterface;

import java.util.List;
import java.util.Map;

/**
* @author LHR
* @date 2018/7/16
* @desc bean invoker
*/
@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier(value = "beanImplOne")
    private BeanInterface beanInterface;

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc print all datums in list.
    * @params []
    * @returns void
    */
    public void say () {
        if (null == list) {
            System.out.println("List<BeanInterface> is null...");
            return;
        }
        System.out.println("List...");
        for (BeanInterface bean : list) {
            System.out.println(bean.getClass().getName());
        }

        if ((null == map) && (map.size() == 0)) {
            System.out.println("Map<String, BeanInterface> is null...");
            return;
        }

        System.out.println("Map...");
        for (String key : map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key).getClass().getName());
        }

        if (null == beanInterface) {
            System.out.println("beanInterface is null.");
            return;
        }

        System.out.println("Qualifier bean interface... ");
        System.out.println("className: " + beanInterface.getClass().getName());
    }
}
