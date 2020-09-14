package calculator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class CalculatorTest {

	
	
	
	
    private Calculator calculator = new Calculator();

    @Test
    public void addFunction(){
    	assertArrayEquals("4.0",calculator.addNumbers(2,2));
    	assertArrayEquals("7.0",calculator.addNumbers(2,2,3));
    	assertArrayEquals("10.0",calculator.addNumbers(2,2,2,2,2));
    	assertArrayEquals("15.0",calculator.addNumbers(5,5,5));
    	assertArrayEquals("0.0",calculator.addNumbers(0));
    	assertArrayEquals("-4.0",calculator.addNumbers(-2,-2));
    }

    private void assertArrayEquals(String string, String addNumbers) {
		
		
	}

	@Test
    public void substractFunction(){
        assertEquals("0.0",calculator.substractNumbers(0,0));
        assertEquals("-2.0",calculator.substractNumbers(10,8,4));
        assertEquals("50.0",calculator.substractNumbers(100,100,-50));
    }

    @Test
    public void multiplyFunction(){
        assertEquals("0.0", calculator.multiplyNumbers(0,0));
        assertEquals("125.0", calculator.multiplyNumbers(5,5.0,5));
        assertEquals("-50.0", calculator.multiplyNumbers(5,-2,5));
        assertEquals("0.0", calculator.multiplyNumbers(2,-3,0));
    }

    @Test
    public void divideFunction(){
        assertEquals("1.0", calculator.divideNumbers(5,5));
        assertEquals("2.5", calculator.divideNumbers(5.0,2));
        assertEquals("You cannot divide by ZERO!", calculator.divideNumbers(5,0));
        assertEquals("-6.0", calculator.divideNumbers(18,-3));
    }

    @Test
    public void sqrtFunction(){
        assertEquals("2.000000000000002", calculator.sqrt(4,2));
    }

    @Test
    public void powFunction(){
        assertEquals("4.0", calculator.power(2,2));
        assertEquals("2.0", calculator.power(2,1));
        assertEquals("27.0", calculator.power(3,3));
        assertEquals("49.0", calculator.power(7,2));
        assertEquals("0.015625", calculator.power(8,-2));
        assertEquals("1.0", calculator.power(5,0));
    }

    @Test
    public void binaryFunction(){
        assertEquals("011",calculator.convertToBinary(3,2));
        assertEquals("0101",calculator.convertToBinary(5,2));
        assertEquals("010001",calculator.convertToBinary(17,2));
        assertEquals("0",calculator.convertToBinary(0,2));
    }

    @Test
    public void decimalFunction(){
        assertEquals("3", calculator.convertBinaryToDecimal("011",2));
        assertEquals("17", calculator.convertBinaryToDecimal("010001",2));
        assertEquals("5", calculator.convertBinaryToDecimal("0101",2));
        assertEquals("0", calculator.convertBinaryToDecimal("0",2));
    }

    @Test
    public void medianFunction() {
        assertEquals("3.0, 4.0", calculator.median(1, 2, 3, 4, 5, 6));
        assertEquals("3.0", calculator.median(1, 2, 3, 4, 5));
        assertEquals("0.0",calculator.median(0));
    }

    @Test
    public void avarageFunction(){
        assertEquals("3.0",calculator.calculateAverage(1,2,3,4,5));
        assertEquals("0.0",calculator.calculateAverage(0,0,0,0));
        assertEquals("2.2",calculator.calculateAverage(0,1,4,6,0));
        assertEquals("1.0",calculator.calculateAverage(1,-2,-3,4,5));
        
        int num,t,s,rem;
 	    Scanner sc=new Scanner(System.in);

       num=sc.nextInt();
t=num;
for(s=0;num>0;num/=10)
{
rem=num%10;
s=(s*10)+rem;
}
if(s==t)
System.out.println(t+" is a palindrome number ");
      else
System.out.println(t+" is not a palindrome number ");
      

    }

}