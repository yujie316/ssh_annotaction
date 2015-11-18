package com.ydcun.quartz;


/**
 * 测试定时任务
 */
public class FirstQuartz {

	public void doTestJob() {
		System.out.println("\n测试定时任务：" + (new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS")).format(new java.util.Date()) + "\n");
	}
	
}