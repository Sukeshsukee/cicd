package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class Convert_Upper_Lower_Vice_Verse {

	public static void main(String[] args) {
		String str="sUkEsH";
		
		StringBuffer str1=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isLowerCase(str.charAt(i))) {
				
				str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			if(Character.isUpperCase(str.charAt(i))) {
				
				str1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
			System.out.println(str1);
	
		}}

