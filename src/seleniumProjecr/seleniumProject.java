package seleniumProjecr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
public class seleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver= new FirefoxDriver();
		
		//driver.get("http://www.facebook.com");
		
		//driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("ap_email")).sendKeys("amberinavya@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Navya@2000");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		

	}

}
