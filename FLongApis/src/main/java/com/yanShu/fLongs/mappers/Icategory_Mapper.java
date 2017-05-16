package com.yanShu.fLongs.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanShu.fLongs.entitys.CategoryEntity;

/**
 * top類目接口
 * @author Sabers
 *
 */
public interface Icategory_Mapper {

	/**
	 * 查询ID编号
	 * @param Integer 
	 * @return List<CategoryEntity>
	 */
	public List<CategoryEntity>findById(@Param("id")Integer id);
	
	/**
	 * 类目名称查询
	 * @param String 
	 * @return List<CategoryEntity>
	 */
	public List<CategoryEntity>findByName(@Param("categoryName")String categoryName);
	
	/**
	 * 根据类型查询，类目的级别
	 * @param categoryType
	 * @return
	 */
	public List<CategoryEntity>findByType(@Param("categoryType")String categoryType);
	
	/**
	 * 根据leafId 查询类目
	 * @param leafId
	 * @return
	 */
	public List<CategoryEntity>findByLeafId(@Param("leafId")String leafId);
	
	/**
	 * 根据level查询类目
	 * @param levelNode
	 * @return
	 */
	public List<CategoryEntity>findByLevelNode(@Param("levelNode")String levelNode);
}