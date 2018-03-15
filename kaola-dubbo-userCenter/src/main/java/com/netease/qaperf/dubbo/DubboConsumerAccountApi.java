package com.netease.qaperf.dubbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.netease.haitao.credits.model.KaolaRequest;
import com.netease.haitao.credits.model.Point4Coupon;
import com.netease.haitao.credits.model.type.ClientType;
import com.netease.haitao.credits.result.AccountCreditsResult;
import com.netease.haitao.credits.service.AccountCreditsServiceFacade;
import com.netease.haitao.credits.service.Point4CouponService;
import com.netease.haitao.credits.service.Point4SignService;
import com.netease.haitao.credits.service.UserSignServiceFacade;
import org.apache.commons.collections.map.HashedMap;

public class DubboConsumerAccountApi {

	private AccountCreditsServiceFacade accountCreditsServiceFacade;
	private Point4SignService point4SignService;
	private Point4CouponService point4CouponService;
	private UserSignServiceFacade userSignServiceFacade;
    KaolaRequest request = new KaolaRequest();


	public DubboConsumerAccountApi(CommonAccountApi commonAccountApi){
		accountCreditsServiceFacade = commonAccountApi.getAccountCreditsServiceFacade();
		point4SignService = commonAccountApi.getPoint4SignService();
		point4CouponService = commonAccountApi.getPoint4CouponService();
		userSignServiceFacade = commonAccountApi.getUserSignServiceFacade();

	}

	public String getAccountCredits(String accouontId) {

		AccountCreditsResult accountCreditsResult = accountCreditsServiceFacade.getAccountCredits(accouontId);
		return JSONObject.toJSONString(accountCreditsResult);
	}

	public String getCreditAndSignInfo(String accouontId, int sourceType) {

        Map<String, Object> creditAndSignInfo = point4SignService.getCreditAndSignInfo(accouontId,sourceType);
		return JSONObject.toJSONString(creditAndSignInfo);
	}

	public String signNew(String accountId, String IP) {
        request.setClientType(ClientType.WAP);
        request.setIp(IP);

        Map<String, Object> result = new HashedMap();
        result.put("code","400");
        result.put("msg","internal fault");

        Map<String, Object> signNew = point4SignService.signNew(accountId,request,result);
		return JSONObject.toJSONString(signNew);
	}

	public String getPointCouponListForWap(String accountId) {

		List<Point4Coupon> pointCouponListForWap = point4CouponService.getPointCouponListForWap(accountId);
		return JSONObject.toJSONString(pointCouponListForWap);
	}

	public String getLatestSign(String accountId, Integer endType, Integer state) {

		Long LatestSign = userSignServiceFacade.getLatestSign(accountId,endType,state);
		return JSONObject.toJSONString(LatestSign);
	}

	public static void main(String[] args) {
        CommonAccountApi commonAccountApi = new CommonAccountApi();
		DubboConsumerAccountApi dubboConsumerAccountApi = new DubboConsumerAccountApi(commonAccountApi);
//        KaolaRequest request = new KaolaRequest();
//        request.setClientType(ClientType.WAP);
//        request.setIp("192.168.0.4");
//
//        Map<String, Object> result1 = new HashedMap();
//        result1.put("code","400");
//        result1.put("msg","internal fault");
//
//		System.out.println(dubboConsumerAccountApi.getAccountCredits("performtest000005@163.com"));
//		System.out.println(dubboConsumerAccountApi.getCreditAndSignInfo("performtest000005@163.com",20));
//        System.out.println(dubboConsumerAccountApi.signNew("performtest000005@163.com","192.168.0.4"));
        System.out.println(dubboConsumerAccountApi.getPointCouponListForWap("performtest000005@163.com"));
//        System.out.println(dubboConsumerAccountApi.getLatestSign("performtest000005@163.com",20,1));
	}

}
