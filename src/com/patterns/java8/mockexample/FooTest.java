package com.patterns.java8.mockexample;

public class FooTest {
	@CUnitTest
	public void testFoo(@Mock(classMock = Foo.class)Foo myFoo) {
		System.out.println("Foo name: " + myFoo.getName() );
	}
	@CUnitTest
	public void testBar( @Mock(classMock = Bar.class)Bar myBar) {
		System.out.println("Bar description: " + myBar.getDescription());
	}
	@CUnitTest
	public void testFooBar(@Mock(classMock = Foo.class)Foo myFoo, @Mock(classMock = Bar.class)Bar myBar) {
		System.out.println("Foo name: " + myFoo.getName() + " Bar description: " + myBar.getDescription());
	}

	
	@CUnitTest
	public void testNOthing() {
		System.out.println("THIS CLASS HAS NO MOCKED PARAMS");
	}

	@CUnitTest
	public void testFooBarDefaultMock(@DefaultMock Foo myFoo, @DefaultMock Bar myBar) {
		System.out.println("Foo name: " + myFoo.getName() + " Bar description: " + myBar.getDescription());
	}
	
	public void notATest() {
		System.out.println("This is not a unit test, and will not run");
	}
}
