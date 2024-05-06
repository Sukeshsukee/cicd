package javaProgram;

public class Reverse_and_ParandromeNumber {

	public static void main(String[] args) {
		/*int num=98745;

		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();

		System.out.println(rev);*/
		
		int num=141;
		int orgno=num;
		int rev=0;

		while(num!=0) {

		rev=rev*10 +num%10;

		

		num=num/10;
	}
		System.out.println(rev);

	if(rev==orgno) {
		System.out.println("parandrom");
	}
	else {
		System.out.println("no");
	}}}
