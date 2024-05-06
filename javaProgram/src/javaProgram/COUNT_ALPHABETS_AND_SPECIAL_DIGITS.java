package javaProgram;

public class COUNT_ALPHABETS_AND_SPECIAL_DIGITS {

	public static void main(String[] args) {
		String str="1234sukesh@#$%&";
		int count = str.length();
		
		
		String digit = str.replaceAll("[0-9]", "");
		int kee = digit.length();
		int d=count-kee;
		System.out.println(d);
		
		String alpha = str.replaceAll("[a-zA-Z]", "");
		int s=alpha.length();
		int aps=count-s;
		System.out.println(aps);
		
		String spl = str.replaceAll("[!@#$%&*]", "");
		int ll = spl.length();
		int sl=count-ll;
		System.out.println(sl);
		
		

	}

}
