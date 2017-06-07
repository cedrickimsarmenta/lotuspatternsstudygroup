package com.easymockjuni.jc;
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class MathApplicationTester extends EasyMockSupport {
	
	// @TestSubject
	// MathApplication mathApplication = new MathApplication();
	//
	// @Mock
	// CalculatorService calcService;

	private MathApplication mathApplication;
	private MathApplication mathApplication2;
	private CalculatorService calcService;
	private CalculatorService calcService2;

	@Before
	public void setUp() {
		mathApplication = new MathApplication();
		mathApplication2 = new MathApplication();
		calcService = EasyMock.createMock(CalculatorService.class);
		calcService2 = EasyMock.createMock(CalculatorService.class);
		//calcService = EasyMock.createStrictMock(CalculatorService.class);
		mathApplication.setCalculatorService(calcService);
		mathApplication2.setCalculatorService(calcService2);
	}
	@Test
	public void testAdd() {
		EasyMock.expect(calcService.add(10.0, 20.0)).andReturn(30.00);
		EasyMock.replay(calcService);
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
		EasyMock.verify(calcService);
	}
	
	//EXPECT CALLS
//	@Test
//	public void testAdd() {
//		EasyMock.expect(calcService.add(10.0, 20.0)).andReturn(30.00);
//		calcService.serviceUsed();
//		EasyMock.expectLastCall().times(1, 3);
//		EasyMock.replay(calcService);
//		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
//
//		EasyMock.verify(calcService);
//	}

//	@Test
//	public void testSub() {
//		EasyMock.expect(calcService.subtract(10.0, 20.0)).andReturn(-10.00);
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(calcService);
//		Assert.assertEquals(mathApplication.subtract(10.0, 20.0), -10.0, 0);
//		EasyMock.verify(calcService);
//	}

//	@Test(expected = RuntimeException.class)
//	public void testMul() {
//
//		EasyMock.expect(calcService.multiply(10.0, 20.0))
//				.andThrow(new RuntimeException("Mul operation not implemented"));
//		EasyMock.replay(calcService);
//		Assert.assertEquals(mathApplication.multiply(10.0, 20.0), 200.0, 0);
//		EasyMock.verify(calcService);
//	}

	//ORDERING
//	@Test
//	public void testMulAndDiv() {
//
//
//		EasyMock.expect(calcService.multiply(20.0, 10.0)).andReturn(200.0);
//		EasyMock.expect(calcService.divide(20.0, 10.0)).andReturn(2.0);
//
//		EasyMock.replay(calcService);
//
//		Assert.assertEquals(mathApplication.multiply(20.0, 10.0), 200.0, 0);
//		Assert.assertEquals(mathApplication.divide(20.0, 10.0), 2.0, 0);
//
//
//		EasyMock.verify(calcService);
//	}
	
//	@Test
//	public void testAll() {
//
//
//		replayAll();
//
//		Assert.assertEquals(mathApplication.multiply(20.0, 10.0), 200.0, 0);
//		Assert.assertEquals(mathApplication2.multiply(20.0, 10.0), 200.0, 0);
//		Assert.assertEquals(mathApplication.divide(20.0, 10.0), 2.0, 0);
//		Assert.assertEquals(mathApplication2.divide(20.0, 10.0), 2.0, 0);
//
//
//		verifyAll();
//	}
}