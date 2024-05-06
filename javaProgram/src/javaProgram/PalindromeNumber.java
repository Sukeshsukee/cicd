package javaProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=646;
		int orgno=num;
		int rev=0;
		
		while(num>0) {
 
			rev=rev*10+num%10;
			num=num/10;
		
		}
		
		if(rev==orgno) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}}

