import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlockNetworkRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mehra\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		DevTools devTools = driver.getDevTools();
//		devTools.createSession();
//		devTools.send(
		driver.get("https://www.google.com/");
		System.out.println("mehraj");
		System.out.println("mohd");
		System.out.println("india");
	}

}
