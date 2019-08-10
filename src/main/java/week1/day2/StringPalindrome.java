package week1.day2;

public class StringPalindrome {
public static void main(String[] args) {
	String txt="level";
	String text="";
	//int count=0;
	char[] cs = txt.toCharArray();
	for(int i=cs.length-1;i>=0;i--) {
		 text = text+cs[i];

	}
	//System.out.print(text);
	if(text.equals(txt)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not a palindrome");
	}
		
		}
		
}

