package com.udemy.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll
	static void  beforeAll() {
		System.out.println("before All");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}
	
	@Test
	void test() {


		System.out.println("test1");
	}

	@Test
	void test1() {


		System.out.println("test2");
	}

	
	@Test
	void test2() {


		System.out.println("test3");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After each");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after All");
	}
	
	
}
