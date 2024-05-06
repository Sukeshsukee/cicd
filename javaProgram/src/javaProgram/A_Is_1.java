package javaProgram;

public class A_Is_1 {

	public static void main(String[] args) {
		String str="abbcccdddd";
		
		int a = str.replaceAll("a", "").length();
		int b = str.replaceAll("b", "").length();
		int c = str.replaceAll("c", "").length();
		int d = str.replaceAll("d", "").length();
		System.out.println("a is "+(str.length()-a));
		System.out.println("b is "+(str.length()-b));
		System.out.println("c is "+(str.length()-c));
		System.out.println("d is "+(str.length()-d));
		
	}

}
