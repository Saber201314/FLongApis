package com.yanShu.Yanshu_Crawler.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yanShu.Yanshu_Crawler.entitys.TopKeyWordEntity;
import com.yanShu.Yanshu_Crawler.services.ItopKeyWord_Service;

@Controller
public class TopKeyWord_Controller {

	/**
	 *类目查询的业务层接口 
	 */
	@Autowired
	private ItopKeyWord_Service itopKeyWord_Service;
	
	/**
	 * 根据leafId 和type查询信息
	 * @param leafId
	 * @param type
	 * @return String
	 */
	@ResponseBody
	@RequestMapping("/findleafIDandtype")
	public String findleafIDandtype(HttpServletRequest request){
		String leafId=request.getParameter("leafId");
		String type=request.getParameter("type");
		System.out.println(leafId + "|"+ type);
		String TopKeyWordjson= "";
		if(type.isEmpty() ==false && leafId.isEmpty() ==false){
			List<TopKeyWordEntity> TopKeyWord=itopKeyWord_Service.findleafIdAndTypeTopKeyWordEntity(leafId, type);
			TopKeyWordjson=JSON.toJSONString(TopKeyWord);
		}
		return TopKeyWordjson;
	}


}
