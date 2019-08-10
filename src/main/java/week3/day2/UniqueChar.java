package week3.day2;

//import java.util.Set;

public class UniqueChar {
	public static void main(String[] args) {
		String ee ="PayPal India";
		char[] e = ee.toCharArray();
		//System.out.println(e[8]);
		for(int i=0; i<=e.length-1; i++) {
			//System.out.print(e[i]);
			int c=0;
			for(int j=0; j<=e.length-1; j++) {
				//System.out.println(e[j]);
				if(e[i]==e[j]) {
					c++;
				}
				
			}
			if(c==1) {
				System.out.print(e[i]);
			}
			
		
			
		}
		
		}
	

	}


