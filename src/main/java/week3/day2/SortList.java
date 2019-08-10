package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("Mas",Keys.TAB);
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("sbc",Keys.TAB);
		//List<String> bb = new ArrayList<String>();
		Thread.sleep(4000);
		driver.findElementByXPath("//label[text()='Sort on Date' ]").click();
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
	   List<WebElement> rows = table.findElements(By.tagName("tr"));
	   System.out.println(rows.size());
	   List<String> bb = new ArrayList<String>();
	  // List<WebElement> column = table.findElements(By.tagName("td"));
	   for (int i=0; i<=rows.size()-1; i++) {
	    List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
	    String text = column.get(1).getText();
	    System.out.println(text);
	    bb.add(text);
	    }
	   Collections.sort(bb);
	   driver.findElementByLinkText("Train Name").click();
	   Thread.sleep(3000);
	   WebElement table1 = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
	   List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
	   System.out.println(rows1.size());
	   List<String> cc = new ArrayList<String>();
	   for (int i=0; i<=rows1.size()-1; i++) {
	    List<WebElement> column1 = rows1.get(i).findElements(By.tagName("td"));
	    String text1 = column1.get(1).getText();
	    System.out.println(text1);
	    cc.add(text1);
	    }
	   if(bb.equals(cc)) {
		   System.out.println("Super");
	   }
	
}
}
