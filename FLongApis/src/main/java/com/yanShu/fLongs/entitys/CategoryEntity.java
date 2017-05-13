package com.yanShu.fLongs.entitys;

/*
 * Top類目实体类
 */
public class CategoryEntity {

	/**
	 * 编号ID
	 */
	private Integer id;
	
	/**
	 * 类目名称
	 */
	private String categoryName;
	
	/**
	 * 类目类型，一级或二级类目，或三级···
	 */
	private String categoryType;
	
	/**
	 * 创建时间
	 */
	private String crateDate;
	
	/**
	 * 类目ID
	 */
	private String leafId;
	
	/**
	 * 标识类目的上级类目ID编号 levelNode= ID
	 */
	private String levelNode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCrateDate() {
		return crateDate;
	}

	public void setCrateDate(String crateDate) {
		this.crateDate = crateDate;
	}

	public String getLeafId() {
		return leafId;
	}

	public void setLeafId(String leafId) {
		this.leafId = leafId;
	}

	public String getLevelNode() {
		return levelNode;
	}

	public void setLevelNode(String levelNode) {
		this.levelNode = levelNode;
	}
}
