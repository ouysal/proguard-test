package com.ouysal.proguard_test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ReflectionTest {

    private static Logger logger = Logger.getLogger(ReflectionTest.class);	

    public void test() {
    	
    	Level level = logger.getLevel();
    	logger.info("level: " + level);

    	logger.info("this method called by reflection.");
	}
}