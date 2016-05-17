package com.ouysal.proguard_test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Class<?> cls = Class.forName("com.ouysal.proguard_test.ReflectionTest");
		Object obj = cls.newInstance();
		Method method = cls.getDeclaredMethod("test", new Class[] {});
		method.invoke(obj);
	}
}
