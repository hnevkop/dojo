package codingdojo;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	
	@Test
	public void addTest12() {
		StringCalculator sc = new StringCalculator();
		String string = "1,2";
		Assert.assertEquals(3, sc.add(string));
	}
	
	@Test
	public void addTest0() {
		StringCalculator sc = new StringCalculator();
		String string = "0";
		Assert.assertEquals(0, sc.add(string));
	}
	
	
	@Test
	public void addTest123() {
		StringCalculator sc = new StringCalculator();
		String string = "1,2,3";
		Assert.assertEquals(6, sc.add(string));
	}
	
	@Test
	public void addTest123NoComma() {
		StringCalculator sc = new StringCalculator();
		String string = "123";
		Assert.assertEquals(6, sc.add(string));
	}

	
	@Test
	public void addTest1001() {
		StringCalculator sc = new StringCalculator();
		String string = "1,0,0,1";
		Assert.assertEquals(2, sc.add(string));
	}
	
	
	@Test
	public void addTestWithNwLine() {
		StringCalculator sc = new StringCalculator();
		String string = "1\n,2\n,3";
		Assert.assertEquals(6, sc.add(string));
	}


}
