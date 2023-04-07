import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllinOnePractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
		//setting proxy;
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		System.out.println(option.getCapability("proxy"));
		option.setCapability("proxy", proxy);
		System.out.println(option.getCapability("proxy"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().deleteAllCookies();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File("D:\\WorkStudies\\workPractiseProjects\\selenium_practice\\src\\screenshots\\firstSS.png"));
		
		
		/*
		//WebElement selectedOption = driver.findElement(By.xpath("//label[@for='benz']"));
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		String chckdOption = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(chckdOption);
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(chckdOption);
		
		
		driver.findElement(By.id("name")).sendKeys(chckdOption);
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		//javascriptexecutor is an interface been used here by assigning driver as javascriptexecutor to js
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,300)");
	
		List<WebElement> forthColValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(WebElement value : forthColValues) {
			sum = sum + Integer.parseInt(value.getText());
			
		}
		//System.out.println(sum);
		int actualSum = Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
		//System.out.println();
		Assert.assertEquals(sum, actualSum,"sum comparison failed");
			
		//auto complete dropdown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("input#autocomplete")).click();
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("Can");
		Thread.sleep(2000);
		
		for(WebElement ddpValue : driver.findElements(By.cssSelector("li.ui-menu-item div.ui-menu-item-wrapper")) ) {
			if(ddpValue.getText().trim().equals("Canada")) {
				ddpValue.click();
				System.out.println(ddpValue.getText());
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("input#autocomplete")).getAttribute("value"));
		System.out.println(js.executeScript("return document.querySelector('#autocomplete').value"));	
		*/
		
		driver.quit();

	}

}
