/*
 * Java
 * - JavaC ---> this 'compiles', it checks for syntax errors
 * 
 * - Java Class --> converts Java Syntax -> Class file
 * 
 * - Java Runtime --> execute -> output...
 * 
 * 
 * 
 * 
 */
public class MyFirstClassWeek0 {

	public static void main(String[] args) {
		System.out.println("My first Java Program!");
		
		int checkAccountBalance = 25;
		int aReturn = 10;
		
		int total = myMethod(checkAccountBalance, aReturn);
		System.out.println("The total:  " + total);
		
	}
	
	public static int myMethod(int a, int b)  {
			return a + b;
	}
}
