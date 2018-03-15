package com.netease.qaperf.dubbo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.netease.haitao.core.common.KaolaRequest;
import com.netease.haitao.core.type.ClientType;
import com.netease.haitao.core.util.IdUtil;
import com.netease.haitao.core.util.context.RequestContext;
import com.netease.haitao.mobile.common.AppFeature;
import com.netease.haitao.mobile.facade.servitization.SearchPharseServiceFacade;
import com.netease.haitao.mobile.view.GoodsListItem;
import com.netease.haitao.mobile.view.goods.PopShopView;
import com.netease.haitao.mobile.view.search.AbstractSearchItem;
import com.netease.haitao.mobile.view.search.ActivitySearchView;
import com.netease.haitao.mobile.view.search.SearchActivityItem;
import com.netease.haitao.mobile.view.search.SearchGoodsItem;
import com.netease.haitao.mobile.view.search.SearchRecommendQueryItem;
import com.netease.haitao.type.SearchFilterType;
import com.netease.haitao.type.SearchSortType;
import com.netease.haitao.type.SpringSerarchSourceType;
import com.netease.haitao.view.AppRequestInfo;
import com.netease.haitao.view.constant.AppGoodsDetailConstant;
import com.netease.haitao.view.module.GoodsModuleItem;
import com.netease.haitao.view.search.SearchParam;
import com.netease.haitao.view.search.SpringSearchResult;
import com.netease.haitao.view.search.SearchParam.FilterType;
import com.netease.haitao.view.search.SearchParam.SortType;
import com.netease.haitao.view.search.SpringSearchResult.FilterField;
import com.netease.haitao.view.search.SpringSearchResult.ResultFilterType;
import com.netease.health.constant.CommonConstant;
import com.netease.health.constant.ConfigParamConstant;
import com.netease.health.model.GoodsProperty;
import com.netease.health.model.GoodsSample;
import com.netease.health.model.GoodsSimpleInfo;
import com.netease.health.model.PromotionSaleItem;
import com.netease.health.model.SearchActivityDetail;
import com.netease.health.model.ShopInfoForView;
import com.netease.health.model.search.ActivityInfoSearch;
import com.netease.health.model.search.GoodsSearchResultInfo;
import com.netease.health.model.search.PropertyNameSearchInfo;
import com.netease.health.model.search.SearchCheckCondtion;
import com.netease.health.model.search.SearchCondtion;
import com.netease.health.model.search.SearchGoodsResult;
import com.netease.kaola.fee.compose.dto.location.AddressDto;

public class DubboConsumerGoods {

	private SearchPharseServiceFacade searchPharseServiceFacade;

	public DubboConsumerGoods(CommonServiceGoods commonServiceGoods) {
		searchPharseServiceFacade = commonServiceGoods.getSearchPharseServiceFacade();
	}


	public static void main(String[] avg) {
		CommonServiceGoods commonServiceGoods = new CommonServiceGoods();
		DubboConsumerGoods dubboConsumerGoods = new DubboConsumerGoods(commonServiceGoods);

	}
}
