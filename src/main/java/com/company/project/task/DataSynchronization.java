package com.company.project.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author by wangtao
 * @date 2020/4/20.
 */
@Component
@Async
public class DataSynchronization {
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled() {
        //System.out.println(System.currentTimeMillis());
    }
}


