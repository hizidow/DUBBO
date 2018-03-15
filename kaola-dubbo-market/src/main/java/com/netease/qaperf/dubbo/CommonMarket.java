package com.netease.qaperf.dubbo;

import com.netease.haitao.kaola_market_compose.remote.commonactivity.api.ActivityRedRainServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommonMarket {

	public ActivityRedRainServiceFacade getRedRain() {
		return redRain;
	}

	private ActivityRedRainServiceFacade redRain;

	public CommonMarket() {
		init();
	}

	public void init() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"consumer-dubbo.xml"});
		context.start();
		redRain = (ActivityRedRainServiceFacade) context.getBean("ActivityRedRainServiceFacade");
	}
}
