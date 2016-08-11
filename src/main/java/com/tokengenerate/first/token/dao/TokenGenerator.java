package com.tokengenerate.first.token.dao;
/**
 * 类名称：TokenGenerator
 * 类描述：token生成器生成接口
 * 按照某种策略定义token生成器时要实现该接口
 * @author aboruo
 * @date 2016年8月11日 下午2:32:19
 * @param <T>
 */
public interface TokenGenerator<T> {
	public String generateTocken(T o);
}
