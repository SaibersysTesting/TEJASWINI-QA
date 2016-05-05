import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//get url		
		driver.get("http://www.match.com/cpx/en-us/match/IndexPage-10/");
		
		driver.manage().window().maximize();
		
		//Selecting man for I am 
		Select Iam = new Select(driver.findElement(By.className("cs hasCustomSelect")));
		Iam.selectByIndex(0);
		driver.close();
}
}