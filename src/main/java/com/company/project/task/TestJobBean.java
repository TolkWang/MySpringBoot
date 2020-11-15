package com.company.project.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangtao
 * @date 2020/11/15 21:02
 * @desc
 */
@Service
public class TestJobBean extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("TestJobBean:::" + Thread.currentThread().getName() + ":::" + SimpleDateFormat.getDateTimeInstance().format(new Date()));
    }
}
