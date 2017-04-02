package com.springboot.lvcr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.lvcr.properties.DemoProperties;
import com.springboot.lvcr.properties.RandomProperties;

/**
 * 
 * @author Edison_lv
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { AppStarter.class })
public class RandomPropertiesTest {

	private static final Log log = LogFactory.getLog(RandomPropertiesTest.class);

	@Autowired
	private RandomProperties randomProperties;

	@Test
	public void test1() throws Exception {
		System.out.println("随机数测试输出：");
		System.out.println("随机字符串 : " + randomProperties.getSecret());
		System.out.println("随机int : " + randomProperties.getNumber());
		System.out.println("随机long : " + randomProperties.getBignumber());
		System.out.println("随机10以下 : " + randomProperties.getNumberLessThanTen());
		System.out.println("随机10-20 : " + randomProperties.getNumberInRange());
		/*
		log.info("随机数测试输出：");
		log.info("随机字符串 : " + demoProperties.getValue());
		log.info("随机int : " + demoProperties.getNumber());
		log.info("随机long : " + demoProperties.getBignumber());
		log.info("随机10以下 : " + demoProperties.getTest1());
		log.info("随机10-20 : " + demoProperties.getTest2());*/

	}
}
