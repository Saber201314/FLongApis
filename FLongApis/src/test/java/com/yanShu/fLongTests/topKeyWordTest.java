package com.yanShu.fLongTests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yanShu.Yanshu_Crawler.entitys.TopKeyWordEntity;
import com.yanShu.Yanshu_Crawler.servicesImpls.TopKeyWord_Service_Impl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-base.xml" })
public class topKeyWordTest {
	@Autowired
	private TopKeyWord_Service_Impl topKeyWord_Service_Impl;
	
	

	/**
	 * 根据leafID和type来查询信息
	 */
    @Test
    public void findleafIdAndtype(){
    	List<TopKeyWordEntity> list=topKeyWord_Service_Impl.findleafIdAndTypeTopKeyWordEntity("50013194","hot");
         System.out.println(JSON.toJSONString(list));
    }
}
