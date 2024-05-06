package javaProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntUnaryOperator;

public class Pyramid_star {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}}
