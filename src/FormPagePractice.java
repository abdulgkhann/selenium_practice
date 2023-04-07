import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPagePractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Abdul Gaffar Khan");
		driver.findElement(By.name("email")).sendKeys("abdul@ffsd.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Abdul");
		driver.findElement(By.id("exampleCheck1")).click();
		
		//static dropdown
		WebElement genderDdp = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(genderDdp);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("08/28/1993");
		
		driver.findElement(By.className("btn-success")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		
		driver.quit();
		
	}

}
