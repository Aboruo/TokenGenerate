package com.tokengenerate.first.token.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.marketactive.util.MD5Util;
import com.tokengenerate.first.token.dao.TokenGenerator;
/**
 * 类名称：AccessTokenGenerator
 * 类描述：访问token生成器
 * @author aboruo
 * @date 2016年8月11日 下午2:35:40
 */
public class AccessTokenGenerator implements TokenGenerator<AccessToken> {
	@Override
	public String generateTocken(AccessToken o) {
		JSONObject userInfoJson = o.getUserInfoJson();
		userInfoJson.put("ServerCurrentTime", System.currentTimeMillis());
		String userInfoJsonStr = userInfoJson.toJSONString();
		String token = MD5Util.md5(userInfoJsonStr);
		return token;
	}
}
