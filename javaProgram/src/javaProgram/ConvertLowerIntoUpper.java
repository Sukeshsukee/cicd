package javaProgram;

public class ConvertLowerIntoUpper {

	public static void main(String[] args) {
		String str="sukesh";
		
	String str2=str.toUpperCase();
	System.out.println(str2);
	
	
	String l2 = str2.toLowerCase();
System.out.println(l2);

char s=str.charAt(3);
System.out.println(s);   //taking letter from string

String trimmed = str.trim();
System.out.println(trimmed);  //trimming white spaces at last
	}

}
