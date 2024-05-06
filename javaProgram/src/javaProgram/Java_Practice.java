package javaProgram;

public class Java_Practice {
	static String name="sukesh";
	int che;
	int bio;
	
	public Java_Practice(int che,int bio) {
		this.che=che;
		this.bio=bio;
	}
	public void viewProfile() {
		System.out.println(che);
		System.out.println(bio);
		System.out.println(name);
		
		}
	public void viewPer() {
	int	total=che+bio;
	float per = total/200;
	float tin=per*100;
	System.out.println(total);
	System.out.println(tin);
	}
	public static void main(String[]args) {
		Java_Practice j=new Java_Practice(20,30);
		j.viewPer();
		j.viewProfile();
	
	}

	}


