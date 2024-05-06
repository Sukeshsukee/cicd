package javaProgram;

public class COUNTVowels_STRING_AND_COCATING_STRING {

	public static void main(String[] args) {
		String str="sukesh";
		int count=str.length();
		String s1=str.replaceAll("[aeiou]", "");
		int ccount=s1.length();
		int total=count-ccount;
		System.out.println(total);
		
String cocats = str.concat(s1);
System.out.println(cocats);
	}

}
