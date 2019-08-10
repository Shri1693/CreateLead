package week3.day1;

public class Bajaj extends Auto{
public void heee() {
	System.out.println("Super");
	
}
public static void main(String[] args) {
	Bajaj bb = new Bajaj();
	bb.heee();
	bb.brake();
	bb.heee();
	bb.horn();
}
}
