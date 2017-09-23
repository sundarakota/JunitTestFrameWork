package com.kota;



import static org.junit.Assert.*;

import org.junit.Test;

public class Timeout {

	@Test(expected=ArithmeticException.class)
	public void test() {
		Firstjava first = new Firstjava();
		first.exception();
				
	}

}
