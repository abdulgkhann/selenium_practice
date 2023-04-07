import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//implementing oops concepts
		WebDriverIntroduction wdIntro = new WebDriverIntroduction();
		
		WebDriver driver = wdIntro.getDriver("firefox");
		
		
		try {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			//locators supported by Selenium : ID, XPATH, Name, ClassName, CSSSelector, TagName, LinkText, PartialLinkText)
			driver.findElement(By.id("inputUsername")).sendKeys("abdul");
			driver.findElement(By.name("inputPassword")).sendKeys("password");
			driver.findElement(By.className("signInBtn")).click();
			
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("abdul");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("oldemail@ggg.mmm");
			//
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear(); //indexing using cssSelector
			driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("newemail@ggg.mmm"); //indexing using xpath
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("2131231312"); //indexing using xpath
			driver.findElement(By.className("reset-pwd-btn")).click();
			
			String tempPwd = driver.findElement(By.xpath("//p[@class='infoMsg' and contains(text(),'Please use temp')]")).getText();
			String[] pwdList = tempPwd.split("'");
			tempPwd = pwdList[1];
			System.out.println(tempPwd);
			
			driver.findElement(By.className("go-to-login-btn")).click();
			driver.findElement(By.id("inputUsername")).sendKeys("abdul");
			driver.findElement(By.name("inputPassword")).clear();
			driver.findElement(By.name("inputPassword")).sendKeys(tempPwd);
			Thread.sleep(1000);
			driver.findElement(By.className("signInBtn")).click();
			
			System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Hello')]")).getText());
			
			Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Hello')]")).getText(),"Hello abdul,");
			
			driver.findElement(By.cssSelector("div[class='login-container'] button[class='logout-btn']")).click();			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			//driver.close();
			driver.quit();
		}
		

	}

}
