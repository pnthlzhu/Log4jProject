package com.pnt.Log4jProject;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Log4j日志框架
 * @author Administrator
 * @date 2016年11月27日
 */
public class Log4jTest {

	/**
	 * Log4j日志框架输出简单日志
	 * @throws Exception
	 */
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
