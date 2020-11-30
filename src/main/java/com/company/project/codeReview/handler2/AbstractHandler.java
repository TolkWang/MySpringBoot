package com.company.project.codeReview.handler2;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author wangtao
 * @date 2020/11/30 13:21
 * @desc
 */
public abstract class AbstractHandler implements InitializingBean {
    public void a1(String name) {
        throw new UnsupportedOperationException();
    }

    public String a2(String name) {
        throw new UnsupportedOperationException();
    }
}
