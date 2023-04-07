import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathLocator {

	public static void main(String[] args) {
		
		// 
		//WebDriverIntroduction wbIntro = ;
		WebDriver driver = new WebDriverIntroduction().getDriver("chrome");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		driver.quit();
	}

}
