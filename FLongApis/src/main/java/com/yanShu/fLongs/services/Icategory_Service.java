package com.yanShu.fLongs.services;

import java.util.List;

import com.yanShu.fLongs.entitys.CategoryEntity;

/**
 * top類目Service
 * @author Sabers
 *
 */
public interface Icategory_Service {

	/**
	 * 查询ID编号
	 * @param id 
	 * @return 类目集合
	 */
	public List<CategoryEntity>findById(Integer id);
	
	/**
	 * 类目名称查询
	 * @param name 
	 * @return 类目集合
	 */
	public List<CategoryEntity>findByName(String name);
	
	/**
	 * 根据类型查询，类目的级别
	 * @param categoryType
	 * @return
	 */
	public List<CategoryEntity>findByType(String categoryType);
	
	/**
	 * 根据leafId 查询类目
	 * @param leafId
	 * @return
	 */
	public List<CategoryEntity>findByLeafId(String leafId);
	
	/**
	 * 根据level查询类目
	 * @param levelNode
	 * @return
	 */
	public List<CategoryEntity>findByLevelNode(String levelNode);
	
	
}
