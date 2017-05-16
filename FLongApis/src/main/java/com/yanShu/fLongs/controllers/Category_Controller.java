package com.yanShu.fLongs.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yanShu.fLongs.entitys.CategoryEntity;
import com.yanShu.fLongs.services.Icategory_Service;

@Controller
public class Category_Controller {

	/**
	 *类目查询的业务层接口 
	 */
	@Autowired
	private Icategory_Service _category_service;
	
	/**
	 * 
	 *使用ID查询
	 */
	@ResponseBody
	@RequestMapping("/findById")
	public String findById(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		List<CategoryEntity> categorys = _category_service.findById(id);
		String categoryJson = JSON.toJSONString(categorys);
		return categoryJson;
	}

	/**
	 *使用类目名称查询
	 */
	@ResponseBody
	@RequestMapping("/findByName")
	public String findByName(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		List<CategoryEntity> categorys = _category_service.findByName(name);
		String categoryJson = JSON.toJSONString(categorys);
		return categoryJson;
	}

	/**
	 *查询属于几级类目
	 */
	@ResponseBody
	@RequestMapping("/findByType")
	public String findByType(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		List<CategoryEntity> categorys = _category_service.findByType(type);
		String categoryJson = JSON.toJSONString(categorys);
		return categoryJson;
	}

	/**
	 *使用类目在淘宝上的ID查询
	 */
	@ResponseBody
	@RequestMapping("/findByLeafId")
	public String findByLeafId(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String leafId = request.getParameter("leafId");
		List<CategoryEntity> categorys = _category_service.findByLeafId(leafId);
		String categoryJson = JSON.toJSONString(categorys);
		return categoryJson;
	}

	/**
	 *根据类目节点取
	 */
	@ResponseBody
	@RequestMapping("/findByLevelNode")
	public String findByLevelNode(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String levelNode = request.getParameter("levelNode");
		List<CategoryEntity> categorys = _category_service.findByLevelNode(levelNode);
		String categoryJson = JSON.toJSONString(categorys);
		return categoryJson;
	}
}