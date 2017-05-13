package com.yanShu.fLongs.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanShu.fLongs.entitys.CategoryEntity;

/**
 * top�Ŀ�ӿ�
 * @author Sabers
 *
 */
public interface Icategory_Mapper {

	/**
	 * ��ѯID���
	 * @param id 
	 * @return ��Ŀ����
	 */
	public List<CategoryEntity>findById(@Param("id")Integer id);
	
	/**
	 * ��Ŀ���Ʋ�ѯ
	 * @param name 
	 * @return ��Ŀ����
	 */
	public List<CategoryEntity>findByName(@Param("categoryName")String categoryName);
	
	/**
	 * �������Ͳ�ѯ����Ŀ�ļ���
	 * @param categoryType
	 * @return
	 */
	public List<CategoryEntity>findByType(@Param("categoryType")String categoryType);
	
	/**
	 * ����leafId ��ѯ��Ŀ
	 * @param leafId
	 * @return
	 */
	public List<CategoryEntity>findByLeafId(@Param("leafId")String leafId);
	
	/**
	 * ����level��ѯ��Ŀ
	 * @param levelNode
	 * @return
	 */
	public List<CategoryEntity>findByLevelNode(@Param("levelNode")String levelNode);
}
