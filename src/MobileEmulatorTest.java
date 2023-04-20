import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mehra\\Downloads\\edgedriver.exe ");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("latitude", 40);
		hashMap.put("longitude", 3);
		hashMap.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", hashMap);
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
        Thread.sleep(3000L);
        driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
        String string = driver.findElement(By.cssSelector(".default-ltr-cache-qsjwmk.edmqlai0")).getText();
        System.out.println(string);
	}

}
