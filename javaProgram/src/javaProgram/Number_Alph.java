package javaProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_Alph {

	
	public static void main(String[]args) {
		String str="1234";
		
		String sr = str.replaceAll("1", " one ");
		String srr = sr.replaceAll("3", " Three ");
		System.out.println(srr);
		
		
		/*input 1234
		 out put one 2 three 4
		 */
}
}

