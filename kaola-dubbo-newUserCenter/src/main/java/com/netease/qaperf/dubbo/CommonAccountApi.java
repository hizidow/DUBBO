package com.netease.qaperf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.netease.kaola.bi.api.AccountApi;

public class CommonAccountApi {

	private AccountApi accountApi;

	public CommonAccountApi() {
		init();
	}

	public void init() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer-dubbo.xml" });
		context.start();
		accountApi = (AccountApi) context.getBean("AccountApi");

	}

	public AccountApi getAccountApi() {
		return accountApi;
	}

}