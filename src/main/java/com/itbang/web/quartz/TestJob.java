package com.itbang.web.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 
 * 测试定时任务类一
 *
 * @author zj
 * @version 1.0 
 *
 * 变更履历：
 *   v1.0 2018年7月25日 zj 初版
 */
public class TestJob implements Job {
 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("*********************");
		
	}
 
}
