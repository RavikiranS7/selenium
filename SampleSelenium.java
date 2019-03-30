import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\test\\Deepu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		driver.close();

	}
}