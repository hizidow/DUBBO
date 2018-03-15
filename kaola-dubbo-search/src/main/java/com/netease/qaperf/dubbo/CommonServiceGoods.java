package com.netease.qaperf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.netease.haitao.mobile.facade.servitization.SearchPharseServiceFacade;
 
public class CommonServiceGoods {
	
	private SearchPharseServiceFacade searchPharseServiceFacade;
	
	public CommonServiceGoods() {
		init();
	}
	
	public void init() {
        @SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer-dubbo.xml"});
        context.start();
        searchPharseServiceFacade = (SearchPharseServiceFacade)context.getBean("searchPharseServiceFacade");
        
    }
	
	public SearchPharseServiceFacade getSearchPharseServiceFacade() {
		return searchPharseServiceFacade;
	}

}  