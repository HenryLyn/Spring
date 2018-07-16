package top.linhuarui.spring.bean.annotation.autowired.multibean.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import top.linhuarui.spring.bean.annotation.autowired.multibean.BeanInterface;

/**
* @author LHR
* @date 2018/7/16
* @desc bean interface implement two
*/
@Order(value = 1)
@Component
public class BeanImplTwo implements BeanInterface {
}
