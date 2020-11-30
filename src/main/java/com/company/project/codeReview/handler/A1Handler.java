package com.company.project.codeReview.handler;

import org.springframework.stereotype.Component;

/**
 * @author wangtao
 * @date 2020/11/30 13:01
 * @desc
 */
@Component
public class A1Handler implements Handler{
    @Override
    public void a1(String name) {
        System.out.println("a1完成任务....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TestFactory.register("A1",this);
    }
}
