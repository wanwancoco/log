package org.wanwanframework.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	Logger logger = LoggerFactory.getLogger(LogTest.class);

	@Test
	public void doIt() { 
		logger.debug("doing my job.............");
		logger.info("vvvvvvvvvvvvvvvv");
	}
}