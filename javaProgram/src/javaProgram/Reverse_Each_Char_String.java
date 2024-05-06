package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class Reverse_Each_Char_String{

	public static void main(String[] args) {
		String str="life is mine";

		String st[]=str.split(" ");
           String rev="";
		for(String ss:st){

		for(int i=ss.length()-1;i>=0;i--){

		rev=rev+ss.charAt(i);
		}
		rev=rev+" ";
		}
		System.out.println(rev);
		
}
}