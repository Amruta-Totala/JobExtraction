import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;  

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner stringScanner = new Scanner(System.in);
		System.out.println("Enter Your Interest\n");
	    String what = stringScanner.next();
	    Scanner stringScanner1 = new Scanner(System.in);
	    System.out.println("Enter Your Prefer Location\n");
	    String where= stringScanner1.next();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.co.in");
        driver.findElement(By.id("text-input-what")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("text-input-what")).sendKeys(what);
        driver.findElement(By.id("text-input-where")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("text-input-where")).sendKeys(where);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/span/div[4]/div[1]/div/div/div/div/form/button")).click();
        System.out.println("Page Title:" + driver.getTitle());
        System.out.println("Jobs Count: " + driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/div[5]/div[1]/div[4]/div/div/div[2]/span[1]")).getText());
        Thread.sleep(2000);
        
        driver.close();
    }

}


