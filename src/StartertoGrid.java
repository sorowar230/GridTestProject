import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class StartertoGrid {

	public static RemoteWebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	
		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.VISTA);
		cap.setBrowserName("chrome");
		
		driver = new RemoteWebDriver(new URL("http://192.168.192.130:5557/wd/hub"), cap);
		
		driver.navigate().to("http://www.google.com");
		driver.findElementByName("q").sendKeys("AnnaNovas IT");
		driver.findElementByName("btnK").click();


	}

}
