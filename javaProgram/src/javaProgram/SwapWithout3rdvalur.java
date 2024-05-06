package javaProgram;

public class SwapWithout3rdvalur {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before"+a+""+b);
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After"+a+""+b);

	}

}
