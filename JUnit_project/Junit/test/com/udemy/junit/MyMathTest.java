package com.udemy.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();
	
	@Test
	void calculateSum_ThreeMemArray() {
		assertEquals(6, math.sum(new int[] {1,2,3}));
	}

	@Test
	void calculateSum_ZeroLengthArray() {
		assertEquals(0, math.sum(new int[] {}));
	}
	
	@Test
	void calculateSum_FiveArray() {
		assertEquals(15, math.sum(new int[] {1,2,3,4,5}));
	}
	
	
}
