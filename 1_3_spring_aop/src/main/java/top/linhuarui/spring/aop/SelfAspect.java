package top.linhuarui.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
* @author LHR
* @date 2018/7/17
* @desc aspect practice
*/
public class SelfAspect {

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc before method.
    * @params []
    * @returns void
    */
    public void before () {
        System.out.println("SelfAspect before method.");
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc after returning method.
    * @params []
    * @returns void
    */
    public void afterReturning () {
        System.out.println("SelfAspect afterReturning method.");
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc after throwing method.
    * @params []
    * @returns void
    */
    public void afterThrowing () {
        System.out.println("SelfAspect afterThrowing method.");
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc after method
    * @params []
    * @returns void
    */
    public void after () {
        System.out.println("SelfAspect after method.");
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc around method
    * @params [proceedingJoinPoint]
    * @returns java.lang.Object
    */
    public Object around (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("SelfAspect around before proceed");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("SelfAspect around after proceed");
        return obj;
    }

    /**
    * @author LHR
    * @date 2018/7/17
    * @desc around init method.
    * @params [proceedingJoinPoint, bizName, times]
    * @returns java.lang.Object
    */
    public Object aroundInit (ProceedingJoinPoint proceedingJoinPoint, String bizName, int times) throws Throwable {
        System.out.println("SelfAspect : bizName - " + bizName + " times " + times);
        System.out.println("SelfAspect aroundInit before proceed");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("SelfAspect aroundInit after proceed");
        return obj;
    }
}
