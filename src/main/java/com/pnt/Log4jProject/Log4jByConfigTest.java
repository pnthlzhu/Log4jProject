package com.pnt.Log4jProject;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

/**
 * 手动加载配置文件
 * @author Administrator
 * @date 2016年11月27日
 */
public class Log4jByConfigTest {
	
	@Before
	public void init() throws Exception {
		PropertyConfigurator.configure("config/log4j.properties");
	}

	@Test
	public void test1() throws Exception {
		Logger logger = Logger.getLogger(Log4jTest.class);
		logger.setLevel(Level.WARN);
		
		logger.trace("I'm trace message");
		logger.info("I'm info message");
		logger.warn("I'm warn message");
		logger.error("I'm error message");
		logger.fatal("I'm fatal message");
	}
}
