package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
		@Before
		public void before()
		{
			System.out.println("amazon");
		}
		@After
		public void after()
		{
			System.out.println("flipkart");
		}
		

	}

