package com.netease.qaperf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.netease.kaola.compose.shop.service.page.ShopPageCompose;


public class CommonShop {

//	private ShopInfoCompose shopInfoCompose;
	private ShopPageCompose shopPageCompose;
//	private ShopConcernCompose shopConcernCompose;

	public CommonShop() {
		init();
	}

	public void init() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer-dubbo.xml" });
		context.start();
//		shopInfoCompose = (ShopInfoCompose) context.getBean("ShopInfoCompose");
		shopPageCompose = (ShopPageCompose) context.getBean("ShopPageCompose");
//		shopConcernCompose = (ShopConcernCompose) context.getBean("ShopConcernCompose");
	}

//	public ShopInfoCompose getShopInfoCompose() {
//		return shopInfoCompose;
//	}

	public ShopPageCompose getShopPageCompose() {
		return shopPageCompose;
	}

//	public ShopConcernCompose getShopConcernCompose() {
//		return shopConcernCompose;
//	}
	
}