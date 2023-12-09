package com.khadri.custom.annoation.main;

public class Main {

	public static void main(String[] args) {

		Class<Test1> testClass = Test1.class;

		boolean annotationPresent = testClass.isAnnotationPresent(Annotation.class);

		System.out.print("====================> " + annotationPresent);
	}
}
