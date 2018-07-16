package top.linhuarui.spring.bean.Annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.base.UnitTestBase;
import top.linhuarui.spring.bean.annotation.scope.AnnoBeanScope;

/**
* @author LHR
* @date 2018/7/16
* @desc Test AnnoBeanScope
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAnnoBeanScope extends UnitTestBase {
    
    public TestAnnoBeanScope () {
        super("classpath:spring-beanannotation.xml");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test say
    * @params []
    * @returns void
    */
    @Test
    public void testSay () {
        AnnoBeanScope annoBeanScope = super.getBean("annoBeanScope");
        annoBeanScope.say("this is test");
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc test bean scope
    * @params []
    * @returns void
    */
    @Test
    public void testScope () {
        AnnoBeanScope annoBeanScope = super.getBean("annoBeanScope");
        System.out.println(annoBeanScope.hashCode());

        AnnoBeanScope annoBeanScope1 = super.getBean("annoBeanScope");
        System.out.println(annoBeanScope1.hashCode());
    }

}
