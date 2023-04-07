import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		Set<String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println(w);
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.close();
		
		

	}

}
