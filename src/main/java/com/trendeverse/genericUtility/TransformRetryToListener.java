package com.trendeverse.genericUtility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransformRetryToListener implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		{
			annotation.setRetryAnalyzer(com.trendeverse.genericUtility.RetryImplementationclass.class);
		}
		
	}

	
	
}
