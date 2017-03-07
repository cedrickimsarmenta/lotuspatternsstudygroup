package com.concurrency.cedric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import com.patterns.java8.mockexample.CUnitTest;
public class SolutionTest {

	@Test
	public void testFoo() {
		
		
		List<Integer> input = new ArrayList<>();
		
		input = Arrays.asList(4, 10, 20);
		assertEquals(0, Solution.findMinDelta(input.size(), input));

		input = Arrays.asList(1, 7, 10, 2, 20, 22);
		assertEquals(1, Solution.findMinDelta(input.size(), input));

		
		input = Arrays.asList(1, 2, 2, 3, 4);
		assertEquals(3, Solution.findMinDelta(input.size(), input));

		
		input = Arrays.asList(3,2,1,0);
		assertEquals(3, Solution.findMinDelta(input.size(), input));

		
		input = Arrays.asList(10, 10, 11, 12, 13);
		assertEquals(1, Solution.findMinDelta(input.size(), input));

		
		input = Arrays.asList(10, 10, 11, 11, 13);
		assertEquals(2, Solution.findMinDelta(input.size(), input));

	}
}
