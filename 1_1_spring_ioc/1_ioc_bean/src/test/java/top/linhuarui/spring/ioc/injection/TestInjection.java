package top.linhuarui.spring.ioc.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.ioc.injection.service.InjectionService;

/**
* @author LHR
* @date 2018/7/16
* @desc test injection.
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {


    public TestInjection () {
        super("classpath:spring-injection.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test setter method
    * @params []
    * @returns void
    */
    @Test
    public void testSetter () {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("need saved datums");
    }

    @Test
    public void testConstructor () {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("need saved datums");
    }
}
