package top.linhuarui.spring.bean.Annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.annotation.autowired.multibean.invoker.BeanInvoker;
import top.linhuarui.spring.bean.annotation.autowired.baseautowired.service.impl.InjectionServiceImpl;

/**
* @author LHR
* @date 2018/7/16
* @desc test autowired
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAutowired extends UnitTestBase {

    public TestBeanAutowired () {
        super("classpath:spring-beanannotation.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test autowired.
    * @params []
    * @returns void
    */
    @Test
    public void testAutowired () {
        InjectionServiceImpl injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("this is autowired test.");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test multi bean
    * @params []
    * @returns void
    */
    @Test
    public void testMultiBean () {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }
}
