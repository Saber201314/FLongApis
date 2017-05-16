package com.yanShu.Yanshu_Crawler.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanShu.Yanshu_Crawler.entitys.TopKeyWordEntity;

public interface ItopKeyWord_Mapper {
	/**
	 * 查询所有信息
	 * @return List<TopKeyWordEntity>
	 */
	List<TopKeyWordEntity> findAllTopKeyWordEntity();
	/**
	 * 添加信息
	 * @param TopKeyWordEntity
	 * @return int
	 */
	 int addTopKeyWordEntity(@Param("topKeyWordEntity")TopKeyWordEntity topKeyWordEntity);
	 /**
	  * 根据时间范围查询信息
	  * @param String
	  * @param String
	  * @return List<TopKeyWordEntity>
	  */
	 List<TopKeyWordEntity> findTimeTopKeyWordEntity(@Param("beginTime")String beginTime,
			                                         @Param("afterTime")String afterTime);
	 
	 /**
	  * 根据关键词名称查询信息
	  * @param String
	  * @return List<TopKeyWordEntity>
	  */
	 List<TopKeyWordEntity> findNameTopKeyWordEntity(@Param("keyWordName")String keyWordName);
	 
	 /**
	  * 根据类目来查询信息
	  * @param String
	  * @param String
	  * @param String
	  * @return List<TopKeyWordEntity>
	  */
	 List<TopKeyWordEntity> findRankTopKeyWordEntity(@Param("rankA")String rankA,
			                                         @Param("rankB")String rankB,
			                                         @Param("rankC")String rankC);
	 /**
	  * 根据ID和type来查询信息
	  * @param String
	  * @return List<TopKeyWordEntity>
	  */
	 List<TopKeyWordEntity> findleafIdAndTypeTopKeyWordEntity(@Param("leafId")String leafId,
			                                                  @Param("type")String type);    
	 /**
	  * 根据state来查询信息
	  * @param int
	  * @return List<TopKeyWordEntity>
	  */
	 List<TopKeyWordEntity> findstateTopKeyWordEntity(@Param("state")int state);
	
	 
	 

}
