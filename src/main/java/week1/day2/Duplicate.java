package week1.day2;
public class Duplicate {
	public static void main(String[] args) {
		int [] a = {1,2,1,22,23,34,33,44,33,34,22,1,34};
		int [] b = new int[a.length];
		//int count=0;
		for(int i =0; i<=a.length-1; i++) {
			int c=0;
		for(int j=i+1; j<=a.length-1; j++ ) {
				if(a[i]==a[j]) {
					c++;
					}
				}
			if(c==0) {
				b[i]=a[i];
				System.out.println(b[i]);
				
				}	
			}
		
		
		}
	}

		
	


