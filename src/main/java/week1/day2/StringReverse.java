package week1.day2;

public class StringReverse {
	public static void main(String[] args) {
		String[] txt = {"I", "am","a","software","Tester"}; 
for(int i=0; i<=txt.length-1; i++) {
	if((i%2)!=0) {
		StringBuffer a = new StringBuffer(txt[i]);
		System.out.print(" "+ a.reverse());
	}else {
		System.out.print(" "+ txt[i]+ " ");
	}
}		
	}
	
}
