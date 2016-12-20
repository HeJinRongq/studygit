package com.yc.annotation;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import org.junit.Test;

public class HelloTestTest {

	@Test
	public void test() {
		Class<?> clazz = HelloTest.class;//取到被注解的类对象
		if (clazz.isAnnotationPresent(Hello.class)) {//判断类是否被Hello注解类注解
			String ann = clazz.getAnnotation(Hello.class).annotationType().getName();//注解的全类名
			System.out.println(ann);
			
			Hello annotation = clazz.getAnnotation(Hello.class);
			
			System.out.println("取到注解的参数值："+annotation.name());
			System.out.println("取到注解的参数值："+annotation.value());
		}
		/*
		Annotation [] annotations = clazz.getAnnotations();//取到所有的注解类
		System.out.println(annotations.length);//输出注解个数
		System.out.println(annotations[0].annotationType().getName()); //输出第一个注解的全类名
		*/
	}
	
   
}
