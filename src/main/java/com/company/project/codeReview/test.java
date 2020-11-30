package com.company.project.codeReview;

import com.company.project.Application;
import com.company.project.codeReview.handler.A1Handler;
import com.company.project.codeReview.handler.Handler;
import com.company.project.codeReview.handler.TestFactory;
import com.company.project.codeReview.handler2.AbstractHandler;
import com.company.project.codeReview.handler2.TestFactory2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangtao
 * @date 2020/11/30 12:57
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class test {

    @Test
    public void mode1() {
        String name = "a1";
        if(name.equals("a1")) {
            //业务逻辑
            new A1Handler().a1(name);

        } else if(name.equals("a2")) {
            //业务逻辑
            System.out.println("a2完成任务....");
        } else if(name.equals("a3")) {
            //业务逻辑
            System.out.println("a3完成任务....");
        } else if(name.equals("a4")) {
            //业务逻辑
            System.out.println("a4完成任务....");
        }
    }

    @Test
    public void mode2() {
        String name = "A1";
        Handler invokeStrategy = TestFactory.getInvokeStrategy(name);
        invokeStrategy.a1(name);
    }

    @Test
    public void mode3() {
        String name = "A1";
        AbstractHandler invokeStrategy = TestFactory2.getInvokeStrategy(name);
        invokeStrategy.a1(name);
    }

    @Test
    public void mode4() {
        String name = "A2";
        AbstractHandler invokeStrategy = TestFactory2.getInvokeStrategy(name);
        String a2 = invokeStrategy.a2(name);
        System.out.println(a2);
    }
}
