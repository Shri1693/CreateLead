package week1.day2;

public class Reverse {
	public static void main(String[] args) {
		String txt="Testleaf";
		/*char[] cs = txt.toCharArray();
		for(int i=cs.length-1;i>=0;i--)
		{
			System.out.print(cs[i]);
		}*/
		System.out.println(txt.length());
		for (int i=txt.length()-1; i>=0;i--) {
		char charAt = txt.charAt(i);
		System.out.print(charAt);
	}
	}
}
