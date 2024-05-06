package javaProgram;

public class SPILT_WORDS {

	public static void main(String[] args) {
		/*String s="java,selenium,testng,maven";
		String str[] = s.split(",");
		
		for(String ob:str) {
			System.out.println(ob);

	}*/
		
		String s="java-lang-packagre-util";

		String str[]=s.split("-");

		for(String ob:str){
		System.out.println(ob);
		}

}
}