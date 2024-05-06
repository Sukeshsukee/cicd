package javaProgram;

public class EVEN_AND_ODD_NUMBERS_IN_ARRAY {

	public static void main(String[] args) {
		int a[]= {2,3,5,6,6};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
				else {
					odd++;
				}
				
			}
			System.out.println(even);
			System.out.println(odd);
			
		}

	}


