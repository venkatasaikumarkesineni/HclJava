package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	@Test(expected=NullPointerException.class)
	public void testNullEx(){
		Data obj=null;
		assertEquals(5,obj.sum(5, 3));
	}
	@Test
	public void testdiv(){
		Data objData=new Data();
		assertEquals(2,objData.div(5,2));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivEx(){
		Data objData=new Data();
		objData.div(5, 0);
	}
	@Test
	public void testGetPropertyTest(){
		Data objData=new Data();
		assertNotNull(objData.getPropertyTest("Bhargav"));
		assertNull(objData.getPropertyTest("Tushar"));
		
	}
	@Test
	public void testeven(){
		Data objData=new Data();
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
		
	}
	@Test
	public void testminArray(){
		int a[]=new int[]{1,9,3};
		Data objData=new Data();
		assertEquals(1,objData.minArray(a));
	}


	@Test
	public void testSayHello(){
		Data objData=new Data();
		assertEquals("welcome to junit",objData.sayHello());
	}
	@Test
	public void testsum(){
		Data objData=new Data();
		assertEquals(4,objData.sum(2,2));
		assertEquals(4,objData.sum(1,3));
	}
	@Test
	public void max3(){
		Data objData=new Data();
		assertEquals(5,objData.max3(5,1,3));
		assertEquals(5,objData.max3(1,5,3));
		assertEquals(5,objData.max3(3,1,5));
	}
	

}
