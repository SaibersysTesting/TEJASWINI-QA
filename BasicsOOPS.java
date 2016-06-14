package com.basics.corejava;

public class BasicsOOPS {

	private int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private static String s;

	// creating method with void
	public void display() {
		System.out.println("Hello World!! " + "\n" + "This is method with void return type");
	}

	// creating method with void and parameters
	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("result =" + c + "This is the method with void and parameters");

	}

	// creating method with return datatype
	public boolean displayValue() {
		System.out.println("This is the method with return datatype");
		return false;

	}

	// creating method with return datatypes and parameters
	public int addition(int a, int b) {
		int result = a + b;
		System.out.println("Hello you are calling sum method with  return type and has  input parameters!!");
		System.out.println("" + result);
		return result;
	}

	// creating variable
	public int sumWithVariable() {
		int count = 0;// count is a variable with method scope
		System.out.println("Hello you are calling method with  return type and has  input parameters!!");
		for (int i = 0; i < 3; i++) {
			count = count + 1;
			System.out.println(" value of count = " + count);
		}
		System.out.println(" value of count = " + count);
		BasicsOOPS obj = new BasicsOOPS();
		return count;
	}
	//static method creation
	public static void message() {
		System.out.println("This is a static method!!");
	}

	//method with return type and no parameters
	// calling static property and static method
	public String displayName() {

		BasicsOOPS.message();// calling static method
		BasicsOOPS.s = "Tejaswini Vodapally";
		return BasicsOOPS.s ;// calling static property

	}
	public static void main(String[] args) {
		BasicsOOPS obj = new BasicsOOPS();
		
        obj.display();
        obj.sum(4, 6);
        
        obj.addition(63, 33);
        obj.displayValue();
        int result = obj.sumWithVariable();
	}

}
