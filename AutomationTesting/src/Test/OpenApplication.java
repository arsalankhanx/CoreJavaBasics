package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareTesting\\JavaWorkspaceST\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	}

}
