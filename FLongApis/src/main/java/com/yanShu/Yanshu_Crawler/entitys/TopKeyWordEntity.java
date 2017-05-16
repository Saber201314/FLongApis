package com.yanShu.Yanshu_Crawler.entitys;

public class TopKeyWordEntity {
	/**
	 * 日期
	 */
	private String thedate;
	/**
	 * 关键词
	 */
	private String keyWordName;
	/**
	 * 价格
	 */
	private String followNum;
	/**
	 * 位置
	 */
	private String liftingPosition;
	/**
	 * 范围
	 */
	private String liftingRange;
	/**
	 * 类目 一级
	 */
	private String rankA;
	/**
	 * 类目 二级
	 */
	private String rankB;
	/**
	 * 类目 三级
	 */
	private String rankC;
	/**
	 * 编号
	 */
	private String leafId;
	/**
	 * 状态
	 */
	private int state;
	/**
	 * 统一编码
	 */
	private String version;
	/**
	 * 类型 hot or up
	 */
	private String type;

	/**
	 * 上升或下降标识符号
	 */
	private String ioclift;

	/**
	 * 排名
	 */
	private String ranking;

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getIoclift() {
		return ioclift;
	}

	public void setIoclift(String ioclift) {
		this.ioclift = ioclift;
	}

	public String getThedate() {
		return thedate;
	}

	public void setThedate(String thedate) {
		this.thedate = thedate;
	}

	public String getKeyWordName() {
		return keyWordName;
	}

	public void setKeyWordName(String keyWordName) {
		this.keyWordName = keyWordName;
	}

	public String getFollowNum() {
		return followNum;
	}

	public void setFollowNum(String followNum) {
		this.followNum = followNum;
	}

	public String getLiftingPosition() {
		return liftingPosition;
	}

	public void setLiftingPosition(String liftingPosition) {
		this.liftingPosition = liftingPosition;
	}

	public String getLiftingRange() {
		return liftingRange;
	}

	public void setLiftingRange(String liftingRange) {
		this.liftingRange = liftingRange;
	}

	public String getRankA() {
		return rankA;
	}

	public void setRankA(String rankA) {
		this.rankA = rankA;
	}

	public String getRankB() {
		return rankB;
	}

	public void setRankB(String rankB) {
		this.rankB = rankB;
	}

	public String getRankC() {
		return rankC;
	}

	public void setRankC(String rankC) {
		this.rankC = rankC;
	}

	public String getLeafId() {
		return leafId;
	}

	public void setLeafId(String leafId) {
		this.leafId = leafId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
