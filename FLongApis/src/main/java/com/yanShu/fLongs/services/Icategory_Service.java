package com.yanShu.fLongs.services;

import java.util.List;

import com.yanShu.fLongs.entitys.CategoryEntity;

/**
 * top�ĿService
 * @author Sabers
 *
 */
public interface Icategory_Service {

	/**
	 * ��ѯID���
	 * @param id 
	 * @return ��Ŀ����
	 */
	public List<CategoryEntity>findById(Integer id);
	
	/**
	 * ��Ŀ���Ʋ�ѯ
	 * @param name 
	 * @return ��Ŀ����
	 */
	public List<CategoryEntity>findByName(String name);
	
	/**
	 * �������Ͳ�ѯ����Ŀ�ļ���
	 * @param categoryType
	 * @return
	 */
	public List<CategoryEntity>findByType(String categoryType);
	
	/**
	 * ����leafId ��ѯ��Ŀ
	 * @param leafId
	 * @return
	 */
	public List<CategoryEntity>findByLeafId(String leafId);
	
	/**
	 * ����level��ѯ��Ŀ
	 * @param levelNode
	 * @return
	 */
	public List<CategoryEntity>findByLevelNode(String levelNode);
	
	
}
