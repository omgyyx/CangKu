package cn.qziedu.wzb.service;

import java.io.Serializable;
import java.util.List;
/**
 * 通用的服务接口
 * @author Administrator
 *
 * @param <T> 任意类
 * @param <ID> 能够串行化的数据类型
 */
public interface BaseService<T,ID extends Serializable> {
	/**
	 * 获取所有数据
	 * @return 集合
	 */
	List<T>  all();
	/**
	 * 获取单个类实例
	 * @param id 编号
	 * @return 类实例
	 */
	T one(ID id);
	/**
	 * 添加
	 * @param t 类实例
	 * @return 影响行数
	 */
	int add(T t);
	/**
	 * 更新
	 * @param t 类实例
	 * @return 影响行数
	 */
	int update(T t);
	/**
	 * 删除
	 * @param id 主键
	 * @return 影响行数
	 */
	
	int delete(ID id);

}
