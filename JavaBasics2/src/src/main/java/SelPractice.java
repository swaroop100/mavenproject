import java.io.File;
import java.io.IOException;

 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;

public class SelPractice {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			/*
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele = driver.findElement(By.id("dropdown-class-example")); 
			Select slt =new Select(ele);
			//driver.findElement(By.xpath("//option[@value='option2']")).click();
			slt.selectByIndex(2);
			slt.selectByValue("option3");	
		
	        //System.setProperty("webdriver.chrome.driver", "F:\\Selenium Resources\\chromedriver_win32\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	       // WebDriver driver = new ChromeDriver();
	                
	        driver.manage().window().maximize();    
	         */ 
	          // check box         
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        driver.findElement(By.id("checkBoxOption1")).click();
	        driver.findElement(By.id("checkBoxOption2")).click();
	        driver.findElement(By.id("checkBoxOption1")).click();
	        driver.findElement(By.xpath("//input[@value='radio1']")).click();
	        driver.findElement(By.xpath("//input[@value='radio2']")).click();
	        
	        
	        
	        //MouseHover
	        /*
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        WebElement element = driver.findElement(By.id("mousehover"));
	        
	        JavascriptExecutor js= (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,1300)");
	        
	        Actions act = new Actions(driver);
	        
	        act.moveToElement(element).build().perform();
	        
	        */
			
			// drag and drop
			 /*
			driver.get("https://jqueryui.com/droppable/");


	        WebElement frm = driver.findElement(By.className("demo-frame"));    
	        driver.switchTo().frame(frm);
	        
	        WebElement elem1= driver.findElement(By.id("draggable"));
	        WebElement elem2= driver.findElement(By.id("droppable"));
	                
	        Actions act = new Actions(driver);
	        act.dragAndDrop(elem1, elem2).build().perform();
	        */
	        
	        //Keyboard inputs
	        /*
	        driver.get("https://the-internet.herokuapp.com/key_presses");
	        
	        Actions a = new Actions(driver);
	        a.sendKeys(Keys.ESCAPE).build().perform();
		*/
		
		
	      
	        //Keyboard inputs
	        /*
	        driver.get("https://the-internet.herokuapp.com/key_presses");
	        
	        Actions a = new Actions(driver);
	        a.sendKeys(Keys.ESCAPE).build().perform();
	        */
	        
	        //Page Scrolling
	         /*   
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,800)");
	        Thread.sleep(3000);
	        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	        */
	        
	        //Screenshots
	        /*   
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src, new File("C:\\screenshots.png"));
	        */
	        
	        
	        /*
	       
	        //clear text that we entered
	         
	         
	        /*
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.findElement(By.id("txtUsername")).sendKeys("abcd");
	        Thread.sleep(3000);
	        driver.findElement(By.id("txtUsername")).clear();
	        */
	        
	                
	            
	            
	        
	        
	        
	    }
		
		
		
		
		
		
		
		

	}


