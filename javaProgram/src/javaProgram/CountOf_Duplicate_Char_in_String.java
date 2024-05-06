package javaProgram;

public class CountOf_Duplicate_Char_in_String {

	public static void main(String[] args) {
		String s="java is my favorite and angalogue arrange of day";

		int Tcounts=s.length();

		int count = s.replaceAll("a","").length();
       
        int total=Tcounts-count;
        System.out.println(total);
		
		
	}

}
