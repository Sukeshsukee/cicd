package javaProgram;

public class largest_num_WithoutIF {

	public static void main(String[] args) {
		int a=1000;
		int b=900;
		int c=250;
		
		int large=a>b?a:b;
		int largest=large>c?large:c;
		
		
		System.out.println(largest);

	}

}
