package javaProgram;

public class palindromeString {

	public static void main(String[] args) {
		String str="padam";
		String s1=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
		rev=rev+str.charAt(i);
		}
		System.out.println(rev);

		if(rev.equals(s1)){
		System.out.println("pandrome");
		}
		else{
		System.out.println("not pandrome");
		}
	}
}
