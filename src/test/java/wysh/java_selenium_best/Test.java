package wysh.java_selenium_best;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("http://wysh.site");
         System.out.println("nihao");
         
         try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.close();
	}

}