package javaProgram;

public class Consecutive_Char_IN_String {

	public static void main(String[] args) {
		
		String str="aabbcccddddddd";
		int to = str.length();
		int Alen = str.replaceAll("a", "").length();
		int Blen = str.replaceAll("b", "").length();
		int clen = str.replaceAll("c", "").length();
		int Dlen = str.replaceAll("d", "").length();
		int lo = to-Alen;
		int mo = to-Blen;
		int no = to-clen;
		int oo = to-Dlen;
		System.out.println("a= "+lo);
		System.out.println("b= "+mo);
		System.out.println("c= "+no);
		System.out.println("d= "+oo);

	}

}
