package com.tokengenerate.first.token.GeneratorFactoryProducer.dao;

import com.tokengenerate.first.token.dao.TokenGenerator;
/**
 * 类名称：TokenGeneratorFactoryDao
 * 类描述：抽象工厂接口，
 * 按照某种策略token生成器的工厂类的要实现的抽象工厂接口
 * @author aboruo
 * @date 2016年8月11日 下午2:28:20
 * @param <T>
 */
public interface TokenGeneratorFactoryDao<T> {
	/**
	 * @Title:provideTokenGenerator
	 * @Description:提供对应策略的token生成器
	 * @author:aboruo
	 * @return TokenGenerator<T>
	 * @date 2016年8月11日 下午2:38:24
	 */
	public TokenGenerator<T> provideTokenGenerator();
}
