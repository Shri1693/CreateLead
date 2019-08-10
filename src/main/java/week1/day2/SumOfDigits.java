package week1.day2;

public class SumOfDigits {
public static void main(String[] args) {
	int [] a= {1,5,4,6};
	int b=0;
	for (int i=0; i<=a.length-1; i++) {
		b=a[i]+b;
		//System.out.println(b+""+"("+a[i]+")");
	}
	System.out.println(b+ "(1+5+4+6)");
}
}
