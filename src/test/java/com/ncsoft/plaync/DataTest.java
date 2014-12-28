package com.ncsoft.plaync;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Test
	public void getCurrentDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.format(date);
		logger.info(sdf.format(date));
	}
}
