package javaProgram;

import java.util.Arrays;

public class CountWordsFromAString {

	public static void main(String[] args) {
		String s="sukesh- is -a -one -of -the -hero -in -world";
		
		String str[]=s.split("-");
		
		int count=0;
		
		for(String ob:str) {
			count++; 
		}
		System.out.println(count);
		

	}}
