package com.trendeverse.genericUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;


/**
 * This class contain common data driver action
 * @author Lenovo
 *
 */
public class WebDriverUtelity
{
	private  WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	private Select sel;
	private JavascriptExecutor jse;
	/**
	 * This method is used to 
	 * launch browser based in browser key
	 * maximize the browser
	 * provide implicit wait
	 * launch the application using url
	 * @param browser
	 * @return
	 */

	public WebDriver launchApplication(String browser,long timeout,String url)
	{

		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("please enter valid browser name");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.get(url);

		return driver;
	}
	/**
	 * this method used to place mouse cursor on specified element
	 * @param driver
	 * @param element  
	 */

	public void mouseOveronElement( WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this method used to perform double click on the element
	 * @param driver
	 * @param element
	 */
	public void doubleClick( WebDriver driver,WebElement element)
	{
		act= new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * this method used to right click on the perticularElement
	 * @param driver
	 * @param element
	 */
	public void rightclick( WebDriver driver,WebElement element )
	{
		act= new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 *this method wait for page load before identefieng any synchronization
	 * @param driver
	 */

	public void waitforPageLoad(  )
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/**
	 *this method is used to switch alert  window and click on ok
	 * @param driver
	 */
	public void switchToalertWindowAndAccept()
	{
		driver.switchTo().alert().accept();
	}
	/**
	 *this method is used to switch alert window and click on ok
	 * @param driver
	 */
	public void switchToalertWindowAndDismiss()
	{
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this method is used to switch to frame window based on index
	 * @param
	 */
	public void switchToFrame( int index)
	{
		driver.switchTo().frame(index);
		
	}
	/**
	 * this method is used to select value drop down value based on index
	 */
	public void  selectByIndex(WebElement element, int index)
	{
		sel= new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 *this method is used select the value of the drop by visible text
	 */
	public void selectByVisibleText(WebElement element,String Text)
	{
		sel= new Select(element);
		sel.selectByVisibleText(Text);

	}

	/**
	 * this method is used pass enter Key appertain in to Browser
	 * @param driver
	 */
	public void passEnterKey(WebDriver driver)
	{

		act.sendKeys(Keys.ENTER).perform();

	}
	/**
	 *this method is used performing scroll by action 
	 * @param element
	 * @param Text
	 */

	public void scrollByAction(WebElement element,String Text)
	{
		jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElement().value='Text'");
	}

	/**
	 * this method is used If the test script gets failed take a screenshot
	 * @param driver
	 * @param screenShotName
	 * @return 
	 * @throws IOException
	 */
	
	public String takesScreenshot(String testCaseName) throws IOException
	{
		String fileName = testCaseName+"_"+ new JavaUtility().getDateTime();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+fileName+".PNG");
		Files.copy(src, dst);
		return  dst.getAbsolutePath();
	}
	
	public  String takesscreenshot2()
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		 String src = ts.getScreenshotAs(OutputType.BASE64);
		 return src;
	}
	/**
	 * wait in home page until invisibility of an bar
	 * @param timeOut
	 * @param element
	 */
	public void waitForPageToLoad(long timeOut,WebElement element)
	{
		wait= new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	/**
	 *this method is used for element to be clickable in GUI and check for specific element for every 500 milliseconds
	 * @param duration
	 * @param element
	 * @param pollingTime
	 * @throws InterruptedException 
	 */
	public void customWait(int duration,WebElement element,long pollingTime)
	{	int count=0;
		while(count<duration)
		{
			element.click();

			try {
				Thread.sleep(pollingTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			break;
		}

	}
	/**
	 * this method is used to handle the multiple windows based on Url 
	 * @param ExpectedUrl
	 */
	public void handlingWindosBasedOnUrl(String ExpectedUrl)
	{
		Set<String> wid = driver.getWindowHandles();
		for( String id:wid)
		{
			driver.switchTo().window(id);
			String actualUrl = driver.getCurrentUrl();
			if(actualUrl.contains(ExpectedUrl))
			{
				break;
			}
		}
	}
	/**
	 * this method is used to scroll till the end
	 */
	public void scrollTillEnd()
	{
		 jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo[0,document.body.scrollHeight]");
	}

	/**
	 * this method is used to scroll till perticular element
	 */
	public void scrollUptoPerticularElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	/**
	 * this method is used to click on the element using java script executor
	 */
	public void clickONElementUsingJavaSE(WebElement element)
	{
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].click()",element);
	}
	

	/**
	 * this method is used enter the value using javascript executor
	 * @param element
	 * @param data
	 */
	public void enterValueUsingJavascriptExecutor(WebElement element,String data)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments=[1]",element,data );
	}
	/**
	 * this method is used to clock on element directly on DOM when it is not clicking
	 */
	
	public void elementNotIntercepted(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	/**
	 * This method is used to close the Tab
	 * @param pFileUtility 
	 * @param excelUtility 
	 */
	public void closeBrowser(ExcelUtility excelUtility, PFileUtility pFileUtility)
	{
		driver.quit();
	}

}



