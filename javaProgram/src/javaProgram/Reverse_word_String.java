package javaProgram;

import java.util.HashSet;

public class Reverse_word_String {

	public static void main(String[] args) {
	String str="sukesh is my fav";
		
		String st[]=str.split(" ");
		String rev="";
		
		for(int i=st.length-1;i>=0;i--) {
			
			System.out.print(st[i]+" ");
		}
	}
}
