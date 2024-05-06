package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RepeatsChar {

	public static void main(String[] args) {
	String str="sukesh";
	int num=0;
	char[] ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				
				System.out.println(ch[i]);
			}
			
		}
	}
	
	}}
