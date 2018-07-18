package top.linhuarui.spring.aop.impl;

import top.linhuarui.spring.aop.Fit;

public class FitImpl implements Fit {
    /**
     * @author LHR
     * @date 2018/7/18
     * @desc
     * @params []
     * @returns void
     */
    @Override
    public void filter() {
        System.out.println("FitImpl filter.");
    }
}
