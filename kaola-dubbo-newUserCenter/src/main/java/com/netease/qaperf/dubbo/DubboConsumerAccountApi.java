package com.netease.qaperf.dubbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.netease.kaola.bi.api.AccountApi;

public class DubboConsumerAccountApi {

	private AccountApi accountApi;
	public List<String> labelSubType = new ArrayList<String>();
	public List<String> labelLists = new ArrayList<String>();

	public DubboConsumerAccountApi(CommonAccountApi commonAccountApi){
		accountApi = commonAccountApi.getAccountApi();
	}

	public String getBatchAccountLabelList(String userName, List<String> labelSubTypes) {

		for (String str : labelSubTypes){
			labelSubType.add(str);
		}
		Map<String, String> getBatchmap = accountApi.getBatchAccountLabelList(userName, labelSubType);
		return getBatchmap.toString();
	}

	public String batchAccountInProgram(List<String> accountids, String program) {
		List<String> batchAccountInProgramList = accountApi.batchAccountInProgram(accountids, program);
		return batchAccountInProgramList.toString();

	}

	public String accountInProgram(String userName, String program) {
		Boolean result = accountApi.accountInProgram(userName, program);
		return result.toString();

	}

	public String getAccountInfo(String userName, List<String> labelSubTypes, List<String> labelList) {
		for (String str : labelList){
			labelLists.add(str);
		}
		Map<String, String> getAccountInfoMap = accountApi.getAccountInfo(userName, labelSubTypes, labelLists);
		return getAccountInfoMap.toString();

	}

	public static void main(String[] args) {
//		DubboConsumerAccountApi dubboConsumerAccountApi = new DubboConsumerAccountApi();
//		
//		System.out.println(dubboConsumerAccountApi.accountInProgram("perf1","22222"));
//		
//		List<String> labelSubTypes = new ArrayList<String>();
//		labelSubTypes.add("crowds");
//		
//		List<String> labelList = new ArrayList<String>();
//		labelList.add("286");
//		
//		System.out.println(dubboConsumerAccountApi.getAccountInfo("perf1",labelSubTypes,labelList));
		
	}

}
