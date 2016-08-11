package com.tokengenerate.first.token.dao;
/**
 * 类名称：TokenGenerable
 * 类描述：token可生成接口
 * @author aboruo
 * @date 2016年8月11日 下午2:31:46
 * @param <T>
 */
public interface TokenGenerable<T> {
	public String generateTo(T o);
}
