package javaProgram;

public class String_CAPS_ANF_D_LOWER_CASE {

	public static void main(String[] args) {
		String str="aklbcdSUHGKE";
		
		
		/*int low = str.replaceAll("[a-z]", "").length();
		System.out.println(low);
		
		int up = str.replaceAll("[A-Z]", "").length();
		System.out.println(up);*/
		
		String low = str.replaceAll("[a-z]", "");
		System.out.println(low);
		
		String up = str.replaceAll("[A-Z]", "");
		System.out.println(up);
		
	}

}
