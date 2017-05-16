package com.yanShu.Yanshu_Crawler.servicesImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanShu.Yanshu_Crawler.entitys.TopKeyWordEntity;
import com.yanShu.Yanshu_Crawler.mappers.ItopKeyWord_Mapper;
import com.yanShu.Yanshu_Crawler.services.ItopKeyWord_Service;

@Service
public class TopKeyWord_Service_Impl implements ItopKeyWord_Service{
	
	@Autowired
	private ItopKeyWord_Mapper itopKeyWord_Mapper;


	public List<TopKeyWordEntity> findAllTopKeyWordEntity() {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findAllTopKeyWordEntity();
	}


	public int addTopKeyWordEntity(TopKeyWordEntity topKeyWordEntity) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.addTopKeyWordEntity(topKeyWordEntity);
	}


	public List<TopKeyWordEntity> findTimeTopKeyWordEntity(String beginTime, String afterTime) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findTimeTopKeyWordEntity(beginTime, afterTime);
	}

	
	public List<TopKeyWordEntity> findNameTopKeyWordEntity(String keyWordName) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findNameTopKeyWordEntity(keyWordName);
	}

	
	public List<TopKeyWordEntity> findRankTopKeyWordEntity(String rankA, String rankB, String rankC) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findRankTopKeyWordEntity(rankA, rankB, rankC);
	}



	
	public List<TopKeyWordEntity> findstateTopKeyWordEntity(int state) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findstateTopKeyWordEntity(state);
	}

      @Override
	public List<TopKeyWordEntity> findleafIdAndTypeTopKeyWordEntity(String leafId, String type) {
		// TODO Auto-generated method stub
		return itopKeyWord_Mapper.findleafIdAndTypeTopKeyWordEntity(leafId, type);
	}
}
