package com.yanShu.fLongTests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yanShu.fLongs.entitys.CategoryEntity;
import com.yanShu.fLongs.services.Icategory_Service;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-base.xml" })
public class catogerTest{

	@Autowired
	private Icategory_Service category_ServiceImpl;
	
	private void ShowCategory(List<CategoryEntity> categorys){
		System.out.println(JSON.toJSONString(categorys));
	}
	
	@Test
	public void findById() {
		// TODO Auto-generated method stub
		Integer id = 16;
		List<CategoryEntity> categorys = category_ServiceImpl.findById(id);
		ShowCategory(categorys);
	}

	@Test
	public void findByName() {
		// TODO Auto-generated method stub
		String name ="����";
		List<CategoryEntity> categorys = category_ServiceImpl.findByName(name);
		ShowCategory(categorys);
	}

	@Test
	public void findByType() {
		// TODO Auto-generated method stub
		String categoryType ="LevelA";
		List<CategoryEntity> categorys = category_ServiceImpl.findByType(categoryType);
		ShowCategory(categorys);
	}

	@Test
	public void findByLeafId() {
		// TODO Auto-generated method stub
		String leafId ="50000671";
		List<CategoryEntity> categorys = category_ServiceImpl.findByLeafId(leafId);
		ShowCategory(categorys);
	}

	@Test
	public void findByLevelNode() {
		// TODO Auto-generated method stub
		String levelNode ="1";
		List<CategoryEntity> categorys = category_ServiceImpl.findByLevelNode(levelNode);
		ShowCategory(categorys);
	}

	
}
