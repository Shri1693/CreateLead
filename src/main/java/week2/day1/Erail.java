package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	WebElement from = driver.findElementById("txtStationFrom");
	from.clear();
	from.sendKeys("MS",Keys.TAB);
	WebElement to = driver.findElementById("txtStationTo");
	to.clear();
	to.sendKeys("TPJ",Keys.TAB);
	Thread.sleep(4000);
	WebElement table = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
   List<WebElement> rows = table.findElements(By.tagName("tr"));
   System.out.println(rows.size());
   List<WebElement> column = table.findElements(By.tagName("td"));
    //List<WebElement> column = rows.get(0).findElements(By.tagName("td"));
    System.out.println(column.size());
   String trainNo = rows.get(rows.size()-1).findElement(By.tagName("td")).getText();
   System.out.println(trainNo);


}
}
