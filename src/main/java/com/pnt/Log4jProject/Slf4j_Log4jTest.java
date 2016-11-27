package com.pnt.Log4jProject;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log4j日志框架
 * @author hlzhu
 * @date 2016年11月25日
 */
public class Slf4j_Log4jTest {

	private Logger logger;

	@Before
	public void init() throws Exception {
		logger = LoggerFactory.getLogger(Slf4j_Log4jTest.class);
	}

	/**
	 * 简单日志输出
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

	/**
	 * 含变量的日志输出
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		String name = "hlzhu";
		String message = "hello logback";
		String[] fruits = new String[]{"apple", "banana"};

		logger.info("Hello,{}!", name);
		logger.info("Hello,{}! {}!", name, message);
		logger.info("Fruits:{},{}", fruits);
	}
}
