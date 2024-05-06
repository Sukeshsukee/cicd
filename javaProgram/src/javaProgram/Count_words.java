package javaProgram;

public class Count_words {

	public static void main(String[]args){
		
		String str="Sukesh is java developer";
		String[] spp = str.split(" ");
		int count=0;
		for(String ss:spp) {
			count++;
		}
		System.out.println(count);
	}


}