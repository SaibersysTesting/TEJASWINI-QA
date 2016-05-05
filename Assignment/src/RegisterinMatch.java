import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterinMatch {
	
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//get url		
		driver.get("http://www.match.com/cpx/en-us/match/IndexPage-10/");
		
		driver.manage().window().maximize();
		
		//Selecting man for I am 
		Select Iam = new Select(driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[1]/select[1]")));
		Iam.selectByIndex(0);
		
		Select Seeking = new Select(driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[1]/select[2]")));
		Seeking.selectByIndex(1);
		
		Select ages = new Select(driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[2]/select[1]")));
		ages.selectByIndex(5);
		
		Select and = new Select(driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[2]/select[2]")));
		and.selectByIndex(10);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[3]")).sendKeys("07054");
	
    driver.findElement(By.xpath("//form[@id = 'form']/fieldset/div[4]")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    
    driver.findElement(By.xpath("//div[@id='eml']/input")).sendKeys("mounika9833@gmail.com");
   driver.findElement(By.xpath("//input[@placeholder = 'Choose password']")).sendKeys("12345");
	
   Select month = new Select(driver.findElement(By.xpath("//select[@id = 'birthMonth']")));
	month.selectByIndex(4);
	
	Select day = new Select(driver.findElement(By.xpath("//select[@id = 'birthDay']")));
	day.selectByValue("19");
	
	Select year = new Select(driver.findElement(By.xpath("//select[@id = 'birthYear']")));
	year.selectByValue("1992");
	
	driver.findElement(By.xpath("//button[@class='ui-submit button button-primary btnNext']")).click();
	driver.findElement(By.xpath("//input[@id = 'usr']")).sendKeys("mouni");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
	driver.findElement(By.xpath("//div[@id='formRegistration']/div[3]/div[2]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='progress']/a")).click();
	
}
}