package com.company.project.codeReview.handler2;


import org.springframework.stereotype.Component;

/**
 * @author wangtao
 * @date 2020/11/30 13:25
 * @desc
 */
@Component
public class A1Handler2 extends AbstractHandler{

    @Override
    public void a1(String name) {
        System.out.println("a1任务完成....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TestFactory2.register("A1",this);
    }
}
