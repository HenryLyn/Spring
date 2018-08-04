package top.linhuarui.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.beanscope.BeanScope;

/**
* @author LHR
* @date 2018/7/16
* @desc test BeanScope
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

    /**
* @author LHR
* @date 2018/7/16
* @desc xml path configuration
* @params []
* @returns
*/
    public TestBeanScope () {
        super("classpath:spring-beanscope.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test say method
    * @params []
    * @returns void
    */
    @Test
    public void testSay () {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}
