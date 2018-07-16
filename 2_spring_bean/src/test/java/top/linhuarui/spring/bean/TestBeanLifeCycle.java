package top.linhuarui.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;

/**
* @author LHR
* @date 2018/7/16
* @desc test bean life cycle.
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {
    
    public TestBeanLifeCycle () {
        super("classpath:spring-lifecycle.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test configuration in bean xml.
    * @params []
    * @returns void
    */
    @Test
    public void testInBean () {
        super.getBean("beanLifeCycle");
    }
}
