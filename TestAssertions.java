package com.kota;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void test() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		// check if 2 objects are same
		assertEquals(str1, str2);

		// check if 2 references do NOT point to the same object
		assertNotSame(str1, str2);

		// check that a condition is true
		assertTrue(val1 < val2);

		// check that a condition is false
		assertFalse(val1 > val2);

		// check that an object is not null
		assertNotNull(str1);

		// check that an object is null
		assertNull(str3);

		// check if 2 object references point to the same object
		assertSame(str4, str5);

		// check if 2 object references not point to the same object
		assertNotSame(str1, str3);

		// check whether 2 arrays are equal to each other
		assertArrayEquals(expectedArray, resultArray);

	}

}
