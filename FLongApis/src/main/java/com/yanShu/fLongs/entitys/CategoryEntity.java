package com.yanShu.fLongs.entitys;

/*
 * Top�Ŀʵ����
 */
public class CategoryEntity {

	/**
	 * ���ID
	 */
	private Integer id;
	
	/**
	 * ��Ŀ����
	 */
	private String categoryName;
	
	/**
	 * ��Ŀ���ͣ�һ���������Ŀ��������������
	 */
	private String categoryType;
	
	/**
	 * ����ʱ��
	 */
	private String crateDate;
	
	/**
	 * ��ĿID
	 */
	private String leafId;
	
	/**
	 * ��ʶ��Ŀ���ϼ���ĿID��� levelNode= ID
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
