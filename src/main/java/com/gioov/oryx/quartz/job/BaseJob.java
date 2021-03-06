package com.gioov.oryx.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2019-02-01
 */
public interface BaseJob extends Job {

    /**
     * 执行方法
     * @param jobExecutionContext JobExecutionContext
     * @throws JobExecutionException JobExecutionException
     */
    @Override
    void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException;

}
