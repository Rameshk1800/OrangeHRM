package Orange;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminPanel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\Java + automation\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password =  driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton= driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin.click();
		
		driver.navigate().back();
		
		WebElement Admin2 = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin2.click();
		
		WebElement selectBox = driver.findElement(By.id("ohrmList_chkSelectRecord_14"));
		selectBox.click();
		
		WebElement deleteBox = driver.findElement(By.id("btnDelete"));
		deleteBox.click();
		
		WebElement confirmBox = driver.findElement(By.id("dialogDeleteBtn"));
		confirmBox.click();
		
		
		
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		job.click();
		
		WebElement job2 = driver.findElement(By.id("menu_admin_employmentStatus"));
	    job2.click();
	    
	    String parentwindow= driver.getWindowHandle();
	    
		WebElement link = driver.findElement(By.linkText("OrangeHRM, Inc"));
		link.click();
		
		
	    for(String childwindow:driver.getWindowHandles()) {
	    	driver.switchTo().window(childwindow);
	    }
	    		    	
	    driver.close();
	    
	    	driver.switchTo().window(parentwindow);
	    	
	    WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
	    leave.click();
	    
	    
	    WebElement date = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
	    date.click();
	    
	    WebElement datetoSelect = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a"));
	    datetoSelect.click();
		
		
		
			
			
		
		
	}

}
