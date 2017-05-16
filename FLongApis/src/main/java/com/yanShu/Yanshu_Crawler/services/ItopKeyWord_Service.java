package com.yanShu.Yanshu_Crawler.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanShu.Yanshu_Crawler.entitys.TopKeyWordEntity;

public interface ItopKeyWord_Service {
	
	List<TopKeyWordEntity> findAllTopKeyWordEntity();
	
	 int addTopKeyWordEntity(TopKeyWordEntity topKeyWordEntity);
	
	 List<TopKeyWordEntity> findTimeTopKeyWordEntity(String beginTime,String afterTime);
	 
	
	 List<TopKeyWordEntity> findNameTopKeyWordEntity(String keyWordName);
	 
	
	 List<TopKeyWordEntity> findRankTopKeyWordEntity(String rankA,
			                                         String rankB,
			                                         String rankC);
	 
	 List<TopKeyWordEntity> findleafIdAndTypeTopKeyWordEntity(String leafId,String type);    
	
	 List<TopKeyWordEntity> findstateTopKeyWordEntity(int state);
	 


}
