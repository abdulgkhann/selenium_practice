import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\WorkStudies\\\\workPractiseProjects\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//webtable
		//1 get no of rows
		//2 get no of columns
		//get data of 2nd row
		System.out.println("No of Rows: "+ driver.findElements(By.cssSelector("table.table-display tr")).size());
		System.out.println("No of Columns: "+ driver.findElements(By.cssSelector("table.table-display th")).size());
		System.out.println("Second Row Data:");
		System.out.println(driver.findElement(By.cssSelector("table.table-display tr:nth-child(3)")).getText());
		
		driver.quit();
		

	}

}
