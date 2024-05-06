package javaProgram;

public class RemoveChar_splCHAr_FRomStrimg {

	public static void main(String[] args) {
		String s="Sukesh";
		String s3="$%&*#@!**&;&%RCGGHFD";
		String s1=s.replaceAll("s", " ");
System.out.println(s1);
 
 s3=s3.replaceAll("[^09A-Za-z]", " ");
System.out.println(s3);
	}

}
