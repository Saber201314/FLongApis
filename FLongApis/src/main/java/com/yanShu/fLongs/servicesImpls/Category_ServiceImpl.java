package com.yanShu.fLongs.servicesImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanShu.fLongs.entitys.CategoryEntity;
import com.yanShu.fLongs.mappers.Icategory_Mapper;
import com.yanShu.fLongs.services.Icategory_Service;

@Service
public class Category_ServiceImpl implements Icategory_Service{

	@Autowired
	private Icategory_Mapper categoryMapper;
	
	@Override
	public List<CategoryEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.findById(id);
	}

	@Override
	public List<CategoryEntity> findByName(String name) {
		// TODO Auto-generated method stub
		return categoryMapper.findByName(name);
	}

	@Override
	public List<CategoryEntity> findByType(String categoryType) {
		// TODO Auto-generated method stub
		return categoryMapper.findByType(categoryType);
	}

	@Override
	public List<CategoryEntity> findByLeafId(String leafId) {
		// TODO Auto-generated method stub
		return categoryMapper.findByLeafId(leafId);
	}

	@Override
	public List<CategoryEntity> findByLevelNode(String levelNode) {
		// TODO Auto-generated method stub
		return categoryMapper.findByLevelNode(levelNode);
	}

}
