package codingdojo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {
	
	@Before
	public void seUp(){
		
	}
	
	@Test
	public void normalLeapZearTest() {
		Year year = new Year(1996);
		Assert.assertTrue(year.isLeap());
	}
	
	@Test
	public void commonYear() {
		Year year = new Year(2001);
		Assert.assertFalse(year.isLeap());
	}
		
	@Test
	public void atypicalCommonYear() {
		Year year = new Year(1900);
		Assert.assertFalse(year.isLeap());
	}
	
	@Test
	public void atypicalLeapYear() {
		Year year = new Year(2000);
		Assert.assertTrue(year.isLeap());
	}
	
	@After
	public void tearDown(){
		
	}
}
