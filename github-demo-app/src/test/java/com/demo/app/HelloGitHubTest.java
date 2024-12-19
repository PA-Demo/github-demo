package com.demo.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloGitHubTest {

	@Test
	public void testValue() {
		assertEquals(1, new HelloGitHub().sampleMethod());
	}
}
