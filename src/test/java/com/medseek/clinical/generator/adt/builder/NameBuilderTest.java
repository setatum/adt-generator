package com.medseek.clinical.generator.adt.builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NameBuilderTest {

	@Test
	public void testNewNameBuilder() {
		NameBuilder nameBuilder = new NameBuilder();
		assertNotNull(nameBuilder);
		String name = nameBuilder.getRandomFullName();
		assertNotNull(name);
		assertTrue(name.indexOf(" ") != -1);
	}
}
