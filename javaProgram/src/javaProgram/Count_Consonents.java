package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Count_Consonents {

	
	public static void main(String[] args) {
	String str="sikesh";
	int total = str.length();
		
	int vowel = str.replaceAll("[aeiou]", "").length();
	
	int vowe = total-vowel;
	System.out.println(total-vowe);
	}
	
	
}
