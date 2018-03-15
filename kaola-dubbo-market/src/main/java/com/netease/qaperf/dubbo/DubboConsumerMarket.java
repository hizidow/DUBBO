package com.netease.qaperf.dubbo;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.netease.haitao.kaola_market_compose.remote.commonactivity.api.ActivityRedRainServiceFacade;
import com.netease.haitao.kaola_market_compose.remote.commonactivity.dto.RedRainGet;


public class DubboConsumerMarket {

	private static ActivityRedRainServiceFacade redRain;
	static Map<String, Object> map  = null;
	
	public DubboConsumerMarket(CommonMarket commonMarket){
		redRain = commonMarket.getRedRain();
	}

	public static String redRainGetResultPage(String accountId, Long actId) {

		RedRainGet redRainGet = redRain.redRainGetResultPage(accountId,actId,map);
		return JSONObject.toJSONString(redRainGet);
	}

	public static void main(String[] args) {
		CommonMarket commonShop = new CommonMarket();
		DubboConsumerMarket dubboConsumerShop = new DubboConsumerMarket(commonShop);
		
		System.out.println(DubboConsumerMarket.redRainGetResultPage("performtest000001@163.com", Long.valueOf(1)));

	}

}
