package week1.day1;

public class MyPhone {
	public static void main(String[] args) {
		Mobile c = new Mobile(); 
		c.sendSMS();
		c.dialNumber();
		String brand = c.brand;
		System.out.println(brand);
		int model = c.model;
		System.out.println(model);
		}

}
