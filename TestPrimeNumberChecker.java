package com.kota;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestPrimeNumberChecker {
	
  private Integer inputNumber;
  private Boolean ExpectedResult;
  private static PrimeNumberChecker primeNumberChecker;
	
	
	@BeforeClass
	public static void initialize(){
		System.out.println("I am initialized only once");
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	 public TestPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.ExpectedResult = expectedResult;
	   }
	 
	 
	 @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	   }
	
	
	// This test will run 5 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(ExpectedResult, 
	      primeNumberChecker.validate(inputNumber));
	   }


	
}
