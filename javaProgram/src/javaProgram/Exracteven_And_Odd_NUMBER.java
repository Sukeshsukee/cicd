package javaProgram;

public class Exracteven_And_Odd_NUMBER {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		System.out.println("aboveEVEN");
		for(int i=0;i<a.length;i++){
		if(a[i]%2==0) {
			
		
		System.out.println(a[i]);
		
		}
		}
		System.out.println("aboveODD");
		for(int j=0;j<a.length;j++){
			
		if(a[j]%2==1) {
			System.out.println(a[j]);
			
		}
	}

}}
