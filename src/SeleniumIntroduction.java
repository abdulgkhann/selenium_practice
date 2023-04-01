import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		//in selenium 4 version - there is no need to setproperty for chromedrive exe file
		//System.setProperty("webdriver.chrome.driver", "D:\\WorkStudies\\workPractiseProjects\\chromedriver.exe");
		
		//webdriver is an interface having only all the methods
		//chromedriver is a class which implements webdriver interface and thus below statement is written in such a way
		//so that using  driver object all the method would be same across different browser drivers.
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();
		

	}

}
