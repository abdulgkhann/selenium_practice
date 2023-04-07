import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 *checkbox exercise
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ; driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 * 
		 * //uncheck checkbox driver.findElement(By.id("checkBoxOption1")).click();
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * 
		 * List<WebElement> noOfCheckbox =
		 * driver.findElements(By.xpath("//input[@type='checkbox']"));
		 * System.out.println(noOfCheckbox.size());
		 */

		// Handling alerts on browser
		driver.findElement(By.id("name")).sendKeys("Abdul K");
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		// driver.close();

	}

}
