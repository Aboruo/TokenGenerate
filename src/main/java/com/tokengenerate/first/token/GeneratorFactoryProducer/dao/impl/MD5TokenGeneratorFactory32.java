package com.tokengenerate.first.token.GeneratorFactoryProducer.dao.impl;

import com.tokengenerate.first.token.GeneratorFactoryProducer.dao.TokenGeneratorFactoryDao;
import com.tokengenerate.first.token.dao.TokenGenerator;
import com.tokengenerate.first.token.dao.impl.AccessToken;
import com.tokengenerate.first.token.dao.impl.AccessTokenGenerator;
/**
 * 类名称：MD5TokenGeneratorFactory32
 * 类描述：采用[MD5生成32位字符]策略定义token生成器的工厂方法
 * 来产生AccessTokenGenerator对象
 * @author aboruo
 * @date 2016年8月11日 下午2:36:33
 */
public class MD5TokenGeneratorFactory32 implements TokenGeneratorFactoryDao<AccessToken> {
	private static AccessTokenGenerator accessTokenGenerator;
	@Override
	public TokenGenerator<AccessToken> provideTokenGenerator() {
		if(accessTokenGenerator == null) accessTokenGenerator = new AccessTokenGenerator();
		return accessTokenGenerator;
	}

}
