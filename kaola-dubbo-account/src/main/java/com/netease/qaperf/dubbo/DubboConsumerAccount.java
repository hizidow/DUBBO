package com.netease.qaperf.dubbo;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSONObject;
import com.netease.haitao.account.model.AccountAssociatorInfo;
import com.netease.haitao.account.service.AccountAssociatorServiceFacade;

public class DubboConsumerAccount {
	private static AccountAssociatorServiceFacade accountAssociatorServiceFacade;

	public DubboConsumerAccount( CommonAccount commonAccount){
		accountAssociatorServiceFacade = commonAccount.getAccountAssociatorServiceFacade();
	}

	public static String batchGetCurrentVipAssociatorInfos(List<String> accountIds){
		List<String> accounts = new ArrayList<String>();
		for (String s : accountIds) {
			accounts.add(s);
		}
		List<AccountAssociatorInfo> accountInfos = accountAssociatorServiceFacade.batchGetCurrentVipAssociatorInfos(accounts);
		return JSONObject.toJSONString(accountInfos);
	}

	public static void main(String[] args) {
		CommonAccount commonAccount = new CommonAccount();
		DubboConsumerAccount dubboConsumerAccount = new DubboConsumerAccount(commonAccount);
		List<String> accountids = new ArrayList<String>();
		accountids.add("laotest1@163.com");
		accountids.add("laotest2@163.com");

		System.out.println(DubboConsumerAccount.batchGetCurrentVipAssociatorInfos(accountids));

	}

}
