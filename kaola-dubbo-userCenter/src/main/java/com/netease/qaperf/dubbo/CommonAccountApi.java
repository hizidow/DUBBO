package com.netease.qaperf.dubbo;

import com.netease.haitao.credits.service.AccountCreditsServiceFacade;
import com.netease.haitao.credits.service.Point4CouponService;
import com.netease.haitao.credits.service.Point4SignService;
import com.netease.haitao.credits.service.UserSignServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonAccountApi {

	private AccountCreditsServiceFacade accountCreditsServiceFacade;
	private Point4SignService point4SignService;
	private Point4CouponService point4CouponService;
	private UserSignServiceFacade userSignServiceFacade;

	public AccountCreditsServiceFacade getAccountCreditsServiceFacade() {
		return accountCreditsServiceFacade;
	}

	public Point4SignService getPoint4SignService() {
		return point4SignService;
	}

	public Point4CouponService getPoint4CouponService() {
		return point4CouponService;
	}

	public UserSignServiceFacade getUserSignServiceFacade() {
		return userSignServiceFacade;
	}

	public CommonAccountApi() {
		init();
	}

	public void init() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer-dubbo.xml" });
		context.start();
		accountCreditsServiceFacade = (AccountCreditsServiceFacade) context.getBean("AccountCreditsServiceFacade");
		point4SignService = (Point4SignService) context.getBean("Point4SignService");
		point4CouponService = (Point4CouponService) context.getBean("Point4CouponService");
		userSignServiceFacade = (UserSignServiceFacade) context.getBean("UserSignServiceFacade");

	}


}