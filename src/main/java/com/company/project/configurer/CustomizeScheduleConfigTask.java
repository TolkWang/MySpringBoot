package com.company.project.configurer;

import com.company.project.task.TestJobBean;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangtao
 * @date 2020/11/15 21:01
 * @desc
 */
@Configuration
public class CustomizeScheduleConfigTask {
    /**
     * 定时任务
     * @return
     */
    @Bean
    public JobDetail testJobDetail() {
        return JobBuilder.newJob(TestJobBean.class)
                .withIdentity("testJobDetail")
                .storeDurably()
                .build();
    }

    /**
     * 触发器，每间隔一段时间触发定时任务
     * @param jobDetail 具体执行的定时任务
     * @return
     */
    @Bean
    public Trigger testJobTrigger(@Qualifier("testJobDetail") JobDetail jobDetail) {
        ScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(3) // 定时任务间隔时间
                .repeatForever(); // 触发器无限循环触发
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity("testJobTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
