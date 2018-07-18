package top.linhuarui.spring.aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.aop.biz.AspectBiz;
import top.linhuarui.spring.base.UnitTestBase;

/**
* @author LHR
* @date 2018/7/17
* @desc test spring aop schema advice
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase {

    public TestAOPSchemaAdvice () {
        super("classpath:spring-aop-schema-advice.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc test aop
    * @params []
    * @returns void
    */
    @Test
    public void testBiz () {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.biz();
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc test init
    * @params []
    * @returns void
    */
    @Test
    public void testInit () {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.init("Biz", 10);
    }

    @Test
    public void testFit () {
        Fit fit = super.getBean("aspectBiz");
        fit.filter();
    }

}
