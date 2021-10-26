import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Black {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Mercury Tours");
	
	
		runwebdriver();
		verifytitle();
		registeruser();
		Thread.sleep(400);
		snclicnowsignin();
		Thread.sleep(100);
		lglogin();
		Thread.sleep(100);
		clickonflights();
		Thread.sleep(100);
		enterflightdetails();
		Thread.sleep(100);
		navigatebacktoflightswhenflightnotavailable();
		Thread.sleep(100);
		closewebdriver();
	}

	public static void runwebdriver() throws InterruptedException
	{
		
		String cdriver="webdriver.chrome.driver";
		String cpath="C:\\Users\\Reverside\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(cdriver,cpath);
		
	driver = new ChromeDriver();
		String path="https://demo.guru99.com/test/newtours/";
		driver.get(path);
		
		Thread.sleep(300);
		//driver.close();
		
	}
	public static void verifytitle()
	{
		String title;
		String Expectedtitle="Welcome: Mercury Tours";
	title=	driver.getTitle();
		
		if(title.equalsIgnoreCase(Expectedtitle))
		{
			System.out.println("Title verified: It's Welcome: Mercury Tours");
		}
		else {
			System.out.println("Wrong page...Wrong Page Return to Sender");
		}
		
	}
	public static void registeruser()
	{
		WebElement register;
	    register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		register.click();
		
		System.out.println("Opening Register Page");
		
		System.out.println("Filling in Contact Information");
		
		WebElement firstname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		firstname.sendKeys("Mynameisuser1");
		WebElement lastname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
	    lastname.sendKeys("Mysurnameisuser1");
	    WebElement phonenumber = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
	phonenumber.sendKeys("0794521414");
	
	System.out.println("Filling in Mailing Information");
	
	WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	emailaddress.sendKeys("driver1@123.com");
	WebElement address = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
	address.sendKeys("Pretoria");
	WebElement city = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
	city.sendKeys("Pretoria");
	WebElement state = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
	state.sendKeys("Gauteng");
	WebElement postalcode = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
	postalcode.sendKeys("0124");
	Select countrydropdownlist = new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
	countrydropdownlist.selectByVisibleText("SOUTH AFRICA");
	
	System.out.println("Filling in User Information");
	
	WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	username.sendKeys("user1234");
	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
	password.sendKeys("Test@1234");
	WebElement confirmpassword = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
	confirmpassword.sendKeys("Test@1234");
	WebElement clicksubmit = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
	clicksubmit.click();
	
	System.out.println("Completed Form and clicking submit");
	
	}
	public static void snclicnowsignin()
	{System.out.println("clicking on sign in button after registering");
		WebElement snclicksignin = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"));
		snclicksignin.click();
		
	}
	
	public static void lglogin()
	{
		System.out.println("Logging in");
		WebElement lgusername = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
		lgusername.sendKeys("user1234");
		WebElement lgpassword = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		lgpassword.sendKeys("Test@1234");
		WebElement lgsubmit = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		lgsubmit.click();
		System.out.println("completed logging in");
	}
	
	public static void clickonflights()
	{System.out.println("clicking on flights");
	WebElement clickflight=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
		clickflight.click();
		
	}
	public static void enterflightdetails()
	{
		System.out.println("Opening flights booking");
		System.out.println("Flight Details");
	    WebElement clickflighttype = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		clickflighttype.click();
		Select nopassangers = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		nopassangers.selectByIndex(2);
		Select departingfrom = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")));
		departingfrom.selectByVisibleText("Paris");
		Select whenmonth = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")));
		whenmonth.selectByVisibleText("September");
		Select whendate = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")));
		whendate.selectByIndex(16);
		Select arrivinginmonth = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")));
		arrivinginmonth.selectByVisibleText("Zurich");
		Select returningmonth = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]")));
		returningmonth.selectByVisibleText("October");
		Select returningdate = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")));
		returningdate.selectByIndex(24);
		System.out.println("Entering Preferences");
		
		WebElement travelclass = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		travelclass.click();
		
		Select airliney = new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
		airliney.selectByVisibleText("Blue Skies Airlines");
		WebElement clickcontinue = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
		clickcontinue.click();
		System.out.println("Clicking Continue button");
	}
	
	public static void navigatebacktoflightswhenflightnotavailable()
	{
		String Actualpagetitle = ( "After flight finder - No Seats Avaialble  ");
		String getpagetitle = driver.getTitle();
		System.out.println("outside if statement on top"+getpagetitle);
		if(Actualpagetitle.equalsIgnoreCase(getpagetitle))
		{System.out.println(getpagetitle+"inside if statement");
			System.out.println("We do not have a place");
		WebElement returntomain = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a"));
		returntomain.click();
		}
		else {
			
			System.out.println("yeeey yeey yeey we got a flight... whoop whoop");
		}
	}
	public static void  closewebdriver()
	{
		System.out.println("closing browser");
		driver.close();
	}
}
