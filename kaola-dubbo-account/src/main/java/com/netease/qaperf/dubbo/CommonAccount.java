package com.netease.qaperf.dubbo;

import com.netease.haitao.account.service.AccountAssociatorServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommonAccount {

	public AccountAssociatorServiceFacade getAccountAssociatorServiceFacade() {
		return accountAssociatorServiceFacade;
	}

	private AccountAssociatorServiceFacade accountAssociatorServiceFacade;

	public CommonAccount() {
		init();
	}

	public void init() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[]{"consumer-dubbo.xml"});
		context.start();
		accountAssociatorServiceFacade = (AccountAssociatorServiceFacade) context.getBean("AccountAssociatorServiceFacade");
	}
}
