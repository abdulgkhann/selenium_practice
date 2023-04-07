import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();	
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(2000);
		List<WebElement> monthLabel = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
		//System.out.println(monthLabel);
		System.out.println(monthLabel.size());
		for(WebElement month : monthLabel) {
			System.out.println(month.getText());
			if(!month.getText().contains("July")){
				driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
			}
		}

	}

}
