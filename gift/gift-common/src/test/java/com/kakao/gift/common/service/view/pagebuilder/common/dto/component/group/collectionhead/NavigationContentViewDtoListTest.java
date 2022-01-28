package com.kakao.gift.common.service.view.pagebuilder.common.dto.component.group.collectionhead;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.kakao.commerce.common.infra.utils.JsonUtils;
import com.kakao.gift.common.infra.client.aitheme.response.RecommenderTypeList;
import com.kakao.gift.common.infra.client.product.GiftProductApiClient;
import com.kakao.gift.common.service.view.pagebuilder.common.processor.BrandAIThemeNavigationProcessor;

@RunWith(MockitoJUnitRunner.class)
public class NavigationContentViewDtoListTest {

	BrandAIThemeNavigationProcessor brandAIThemeNavigationProcessor;

	@Mock
	GiftProductApiClient giftProductApiClient;

	@Before
	public void init() {
		brandAIThemeNavigationProcessor = new BrandAIThemeNavigationProcessor(giftProductApiClient);
	}

	@Test
	public void test() throws JsonProcessingException {

		String json = "{\n" + "    \"jobType\": \"birthday\",\n" + "    \"basedAt\": \"20220118090000\",\n" + "    \"typeName\": \"price_range\",\n" +
		              "    \"details\": [\n" + "        {\n" + "            \"filters\": [\n" + "                {\n" +
		              "                    \"name\": \"price_range\",\n" + "                    \"value\": \"0\"\n" + "                },\n" +
		              "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" +
		              "            ],\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" + "            \"filters\": [\n" +
		              "                {\n" + "                    \"name\": \"price_range\",\n" + "                    \"value\": \"1\"\n" +
		              "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" +
		              "                }\n" + "            ],\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" +
		              "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"price_range\",\n" +
		              "                    \"value\": \"2\"\n" + "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" +
		              "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" + "            \"recommendProductCount\": 200\n" +
		              "        },\n" + "        {\n" + "            \"filters\": [\n" + "                {\n" +
		              "                    \"name\": \"price_range\",\n" + "                    \"value\": \"3\"\n" + "                },\n" +
		              "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" +
		              "            ],\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" + "            \"filters\": [\n" +
		              "                {\n" + "                    \"name\": \"price_range\",\n" + "                    \"value\": \"4\"\n" +
		              "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" +
		              "                }\n" + "            ],\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" +
		              "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"price_range\",\n" +
		              "                    \"value\": \"5\"\n" + "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" +
		              "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" + "            \"recommendProductCount\": 200\n" +
		              "        }\n" + "    ]\n" + "}";

		String json2 = "{\n" + "    \"jobType\": \"birthday\",\n" + "    \"basedAt\": \"20220118090000\",\n" + "    \"typeName\": \"gift_brand_id\",\n" +
		               "    \"details\": [\n" + "        {\n" + "            \"filters\": [\n" + "                {\n" +
		               "                    \"name\": \"gift_brand_id\",\n" + "                    \"value\": \"33\"\n" + "                },\n" +
		               "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" +
		               "            ],\n" + "            \"recommendRank\": 1,\n" + "            \"recommendProductCount\": 159\n" + "        },\n" +
		               "        {\n" + "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"2\"\n" + "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" +
		               "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" + "            \"recommendRank\": 2,\n" +
		               "            \"recommendProductCount\": 136\n" + "        },\n" + "        {\n" + "            \"filters\": [\n" +
		               "                {\n" + "                    \"name\": \"gift_brand_id\",\n" + "                    \"value\": \"2088\"\n" +
		               "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" +
		               "                }\n" + "            ],\n" + "            \"recommendRank\": 3,\n" + "            \"recommendProductCount\": 137\n" +
		               "        },\n" + "        {\n" + "            \"filters\": [\n" + "                {\n" +
		               "                    \"name\": \"gift_brand_id\",\n" + "                    \"value\": \"1893\"\n" + "                },\n" +
		               "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" +
		               "            ],\n" + "            \"recommendRank\": 4,\n" + "            \"recommendProductCount\": 171\n" + "        },\n" +
		               "        {\n" + "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"4587\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 5,\n" + "            \"recommendProductCount\": 62\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"86\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 6,\n" + "            \"recommendProductCount\": 98\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"5708\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 7,\n" + "            \"recommendProductCount\": 90\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"1382\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 8,\n" + "            \"recommendProductCount\": 139\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"893\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 9,\n" + "            \"recommendProductCount\": 125\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"10546\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 10,\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"9663\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 11,\n" + "            \"recommendProductCount\": 107\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"9839\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 12,\n" + "            \"recommendProductCount\": 58\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"3944\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 13,\n" + "            \"recommendProductCount\": 156\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"9815\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 14,\n" + "            \"recommendProductCount\": 200\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"10235\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 15,\n" + "            \"recommendProductCount\": 193\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"3514\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 16,\n" + "            \"recommendProductCount\": 97\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"1140\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 17,\n" + "            \"recommendProductCount\": 64\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"7519\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 18,\n" + "            \"recommendProductCount\": 136\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"6737\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 19,\n" + "            \"recommendProductCount\": 178\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"10588\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 20,\n" + "            \"recommendProductCount\": 107\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"7520\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 21,\n" + "            \"recommendProductCount\": 64\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"3726\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 22,\n" + "            \"recommendProductCount\": 99\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"2054\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 23,\n" + "            \"recommendProductCount\": 79\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"134\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 24,\n" + "            \"recommendProductCount\": 159\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"748\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 25,\n" + "            \"recommendProductCount\": 161\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"9541\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 26,\n" + "            \"recommendProductCount\": 107\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"4591\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 27,\n" + "            \"recommendProductCount\": 114\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"2875\"\n" + "                },\n" + "                {\n" +
		               "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" +
		               "            \"recommendRank\": 28,\n" + "            \"recommendProductCount\": 75\n" + "        },\n" + "        {\n" +
		               "            \"filters\": [\n" + "                {\n" + "                    \"name\": \"gift_brand_id\",\n" +
		               "                    \"value\": \"6\"\n" + "                },\n" + "                {\n" + "                    \"name\": \"type\",\n" +
		               "                    \"value\": \"A\"\n" + "                }\n" + "            ],\n" + "            \"recommendRank\": 29,\n" +
		               "            \"recommendProductCount\": 41\n" + "        },\n" + "        {\n" + "            \"filters\": [\n" + "                {\n" +
		               "                    \"name\": \"gift_brand_id\",\n" + "                    \"value\": \"8\"\n" + "                },\n" +
		               "                {\n" + "                    \"name\": \"type\",\n" + "                    \"value\": \"A\"\n" + "                }\n" +
		               "            ],\n" + "            \"recommendRank\": 30,\n" + "            \"recommendProductCount\": 79\n" + "        }\n" + "    ]\n" +
		               "}";

		ObjectMapper om = new ObjectMapper();
//		RecommenderTypeList recommenderTypeList = om.readValue(json, RecommenderTypeList.class);

		RecommenderTypeList recommenderTypeList = JsonUtils.fromJson(json, RecommenderTypeList.class);
		RecommenderTypeList recommenderTypeList2 = JsonUtils.fromJson(json2, RecommenderTypeList.class);

		NavigationContentViewDtoList navigationContentViewDtoList = NavigationContentViewDtoList.fromRecommenderTypeList(recommenderTypeList);
		NavigationContentViewDtoList navigationContentViewDtoList2 = brandAIThemeNavigationProcessor.process(recommenderTypeList2);


		assertEquals(recommenderTypeList.getTypeName(), "price_range");
		assertEquals(navigationContentViewDtoList.getContents().isEmpty(), false);
		assertEquals(navigationContentViewDtoList2.getContents().isEmpty(), false);

	}

}