package com.tokengenerate.first.token.dao.impl;

import javax.inject.Named;

import com.alibaba.fastjson.JSONObject;
import com.tokengenerate.first.token.dao.TokenGenerable;
import com.tokengenerate.first.token.dao.TokenGenerator;
/**
 * 类名称：AccessToken
 * 类描述：访问Token类，实现了TokenGenerable接口
 * 该类可以生成token
 * @author aboruo
 * @date 2016年8月11日 下午2:33:45
 */
@Named(value="accessTocken")
public class AccessToken implements TokenGenerable<AccessToken> {
	private JSONObject userInfoJson;
	private TokenGenerator<AccessToken> tockenGenerator;
	public JSONObject getUserInfoJson() {
		return userInfoJson;
	}
	public void setUserInfoJson(JSONObject userInfoJson) {
		this.userInfoJson = userInfoJson;
	}
	public TokenGenerator<AccessToken> getTockenGenerator() {
		return tockenGenerator;
	}
	public void setTockenGenerator(TokenGenerator<AccessToken> tockenGenerator) {
		this.tockenGenerator = tockenGenerator;
	}
	@Override
	public String generateTo(AccessToken o) {
		return this.tockenGenerator.generateTocken(this);
	}

}
