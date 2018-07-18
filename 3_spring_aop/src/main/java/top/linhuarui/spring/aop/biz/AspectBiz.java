package top.linhuarui.spring.aop.biz;

/**
* @author LHR
* @date 2018/7/17
* @desc aspect biz class
*/
public class AspectBiz {

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc biz method
    * @params []
    * @returns void
    */
    public void biz() {
        System.out.println("AspectBiz biz method.");
//        throw new RuntimeException();
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc init method
    * @params [bizName, times]
    * @returns void
    */
    public void init (String bizName, int times) {
        System.out.println("AspectBiz init: bizName - " + bizName + " times " + times);
    }
}
