package cn.qziedu.wzb.service;

import java.io.Serializable;
import java.util.List;
/**
 * ͨ�õķ���ӿ�
 * @author Administrator
 *
 * @param <T> ������
 * @param <ID> �ܹ����л�����������
 */
public interface BaseService<T,ID extends Serializable> {
	/**
	 * ��ȡ��������
	 * @return ����
	 */
	List<T>  all();
	/**
	 * ��ȡ������ʵ��
	 * @param id ���
	 * @return ��ʵ��
	 */
	T one(ID id);
	/**
	 * ���
	 * @param t ��ʵ��
	 * @return Ӱ������
	 */
	int add(T t);
	/**
	 * ����
	 * @param t ��ʵ��
	 * @return Ӱ������
	 */
	int update(T t);
	/**
	 * ɾ��
	 * @param id ����
	 * @return Ӱ������
	 */
	
	int delete(ID id);

}
