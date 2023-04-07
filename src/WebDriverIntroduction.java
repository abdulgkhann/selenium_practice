import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverIntroduction {

	public WebDriver getDriver(String brwsrName) {
		
		//in selenium 4 version - there is no need to setproperty for chromedrive exe file
		//System.setProperty("webdriver.chrome.driver", "D:\\WorkStudies\\workPractiseProjects\\chromedriver.exe");		
		
		//webdriver is an interface having only all the methods
		//chromedriver is a class which implements webdriver interface and thus below statement is written in such a way
		//so that using  driver object all the method would be same across different browser drivers.

		WebDriver driver;
		if(brwsrName=="chrome") {
			//System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(brwsrName=="edge") {
			//System.setProperty("webdriver.edge.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(brwsrName=="firefox") {
			//System.setProperty("webdriver.gecko.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
		
	}

	

}
