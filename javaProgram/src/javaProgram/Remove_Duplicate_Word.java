package javaProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Word {

	public static void main(String[] args) {
	String str="java is my fav my langauage java";
	
	String st[]=str.split(" ");
	HashSet<String> s=new HashSet<String>();
	for(String ss:st) {
		s.add(ss);
	}
	for(String result:s) {
		System.out.print(result+" ");
	}
	

}
}