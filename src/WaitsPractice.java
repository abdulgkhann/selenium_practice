import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//webdriverwait object is been declared here with 5 seconds time
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@id='usertype' and @value='user']")).click();
		
		//here i am using explict wait for popup to appear
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		//driver.findElement(By.id("okayBtn")).click();
		
		//using select class for static dropdown
		Select s = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		s.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		//here i am using explict wait for home page to appear
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-brand")));
		System.out.println(driver.findElement(By.className("navbar-brand")).getText());
		
		List<WebElement> listofAddBtn = driver.findElements(By.xpath("//button[text()='Add ']"));
		
		for(WebElement add : listofAddBtn) {
			add.click();
		}
		
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("button[class='btn btn-success']")).getText());
		
		driver.quit();
		
		
		
		

	}

}

