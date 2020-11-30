package com.company.project.codeReview.handler2;

import org.springframework.stereotype.Component;

/**
 * @author wangtao
 * @date 2020/11/30 13:33
 * @desc
 */
@Component
public class A2Handler2 extends AbstractHandler{

    @Override
    public String a2(String name) {
        System.out.println("a2任务完成.....");
        return "a2 success";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TestFactory2.register("A2",this);
    }
}
