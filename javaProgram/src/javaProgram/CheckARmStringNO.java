package javaProgram;

public class CheckARmStringNO {

	public static void main(String[] args) {
		int num=123;
		int orgno=num;
		int cubeno=0;

		while(num>0){

		int reminder=num%10;

		cubeno=cubeno+(reminder*reminder*reminder);

		num=num/10;
		}
		if(cubeno==orgno){
         System.out.println("yes");
		}
		else{
      System.out.println("no");
		}}}
	
