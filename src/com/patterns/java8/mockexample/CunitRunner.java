package com.patterns.java8.mockexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CunitRunner {
    public static void main(String args[]) {
    	System.out.println("Runing CUnitTests");
    	
    	FooTest myTest  = new FooTest();
    	
    	for (Method m: FooTest.class.getMethods()) {
    		if(!m.isAnnotationPresent(CUnitTest.class)) {
    			continue;
    		}
    		List<Object> mockedParameters = new ArrayList<Object>();
    		
    		for(Parameter p: m.getParameters()) {
    			if(p.isAnnotationPresent(Mock.class)) {
    				Mock mockAnnotation = p.getAnnotationsByType(Mock.class)[0];
    				//Mocking mechanisms
    				if(mockAnnotation.classMock().equals(Foo.class)) {
    					Foo mockFoo = new Foo();
    					mockFoo.setName("Default foo name");
        				mockedParameters.add(mockFoo);
    				} else if (mockAnnotation.classMock().equals(Bar.class)) {
    					Bar mockBar = new Bar();
    					mockBar.setDescription("Default bar decription");
    					mockedParameters.add(mockBar);
    				}
    			}
    		}
    		
    		
    		try {
    			
    			System.out.println("*** Running CUnit Test: " + m.getName());
    			if(mockedParameters.isEmpty()) {
    				m.invoke(myTest);
    			} else {
    				m.invoke(myTest, mockedParameters.toArray());
    			}

			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
    	}
    }
}
