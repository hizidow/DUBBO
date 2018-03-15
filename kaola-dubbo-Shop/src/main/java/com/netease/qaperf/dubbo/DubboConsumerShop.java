package com.netease.qaperf.dubbo;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.netease.kaola.compose.shop.service.basic.ShopConcernCompose;
import com.netease.kaola.compose.shop.service.basic.ShopInfoCompose;
import com.netease.kaola.compose.shop.service.page.ShopPageCompose;
import com.netease.kaola.compose.shop.vo.basic.ShopBasicInfoVO;
import com.netease.kaola.compose.shop.vo.basic.ShopBusinessCategoryVO;
import com.netease.kaola.compose.shop.vo.basic.ShopEntranceVO;
import com.netease.kaola.compose.shop.vo.common.ShopBaseResult;

public class DubboConsumerShop {

//	private ShopInfoCompose shopInfoCompose;
	private ShopPageCompose shopPageCompose;
//	private ShopConcernCompose shopConcernCompose;
	
	public DubboConsumerShop(CommonShop commonShop){
//		shopInfoCompose = commonShop.getShopInfoCompose();
		shopPageCompose = commonShop.getShopPageCompose();
//		shopConcernCompose = commonShop.getShopConcernCompose();
	}

//	public String getShopEntranceByShopId(Long shopId) {
//
//		ShopEntranceVO shopEntranceVO = shopInfoCompose.getShopEntranceByShopId(shopId);
//		return JSONObject.toJSONString(shopEntranceVO);
//	}

	public String searchShopPageGoods(Long shopId, Long pageId) {
		List<Long> searchShopPageGoods = shopPageCompose.searchShopPageGoods(shopId, pageId);
		return searchShopPageGoods.toString();

	}

//	public String searchShopHomePageGoods(Long shopId) {
//		List<Long> searchShopHomePageGoods = shopPageCompose.searchShopHomePageGoods(shopId);
//		return searchShopHomePageGoods.toString();
//
//	}

//	public String searchConcernedShopByShopName(String accountId, String shopName, Long lastShopId, Integer pageSize) {
//		ShopBaseResult<List<ShopBasicInfoVO>> searchConcernedShopByShopName = shopConcernCompose.searchConcernedShopByShopName(accountId, shopName, lastShopId, pageSize);
//
//		return JSONObject.toJSONString(searchConcernedShopByShopName);
//	}
//
//	public String getConcernedShopCategoryList(String accountId) {
//		ShopBaseResult<List<ShopBusinessCategoryVO>> getConcernedShopCategoryList = shopConcernCompose.getConcernedShopCategoryList(accountId);
//
//		return JSONObject.toJSONString(getConcernedShopCategoryList);
//	}
//
//	public String searchConcernedShopByCategory(String accountId, Long categoryId, Boolean couponPriority, Long lastShopId, Integer pageSize) {
//		ShopBaseResult<List<ShopBasicInfoVO>> searchConcernedShopByCategory = shopConcernCompose.searchConcernedShopByCategory(accountId, categoryId, couponPriority, lastShopId, pageSize);
//		return JSONObject.toJSONString(searchConcernedShopByCategory);
//
//	}

	public static void main(String[] args) {
		CommonShop commonShop = new CommonShop();
		DubboConsumerShop dubboConsumerShop = new DubboConsumerShop(commonShop);
		
//		System.out.println(dubboConsumerShop.getShopEntranceByShopId(Long.valueOf(7669)));
//		
		System.out.println(JSONObject.toJSONString(dubboConsumerShop.searchShopPageGoods(Long.valueOf(74859), Long.valueOf(112175))));
//		
//		System.out.println(JSONObject.toJSONString(dubboConsumerShop.searchShopHomePageGoods(Long.valueOf(4512))));
//		
//		System.out.println(dubboConsumerShop.searchConcernedShopByShopName("performtest000001@163.com", "店", Long.valueOf(0), 20));
//
//		System.out.println(dubboConsumerShop.getConcernedShopCategoryList("performtest000001@163.com"));
//
//		System.out.println(dubboConsumerShop.searchConcernedShopByCategory("performtest000001@163.com",Long.valueOf(0),true,Long.valueOf(0),20));
		
	}

}
