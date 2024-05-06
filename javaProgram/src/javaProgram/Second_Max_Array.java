package javaProgram;

public class Second_Max_Array {

	public static void main(String[] args) {
		int a[]= {2,1,4,7,9,8,5,2,3,6,99,8,8,5},max=0,min=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i] ;
				
			
			for(int j=0;j<a.length;j++) {
				if(a[j]<max) {
					min=a[j];
				}
				
			}}
		}
		
	System.out.println(min);

	}

}
