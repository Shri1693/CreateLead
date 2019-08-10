package week1.day1;

public class Fibanocci {
	public static void main(String[] args) {
		int c;
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		for(int i=1;i<=20;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

}
