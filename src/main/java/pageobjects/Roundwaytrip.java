package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.Utility;

public class Roundwaytrip<WebDriverWait> extends Utility {
	public WebDriver driver;

	public Roundwaytrip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class=\"css-1dbjc4n r-zso239\"])[2]")
	WebElement roundbtn;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement date;

	@FindBy(xpath = "//div[text()='Select Date']")
	WebElement date2;
	@FindBy(xpath = "(//div[text()='31']) [1]")
	WebElement dobclick;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passenger;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement adult;
	@FindBy(css = "div[data-testid='home-page-flight-cta']")
	WebElement search;
	@FindBy(css = "div[data-testid=\"continue-search-page-cta\"]")
	WebElement fight;
	//(//div[@data-testid='undefined-calendar-day-29'])[1]
	//(//div[text()='31']) [1]

	public void roundtrip() throws InterruptedException {
		roundbtn.click();
		from.sendKeys("MAA");
		Thread.sleep(5000);
		to.sendKeys("IXB");
		Thread.sleep(4000);
		date.click();
		date2.click();
		Thread.sleep(2000);
		//*[@id="main-container"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[5]/div[6]/div/div
		//WebDriverWait wait = new WebDriverWait(driver, 20);
	//	dobclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-testid='undefined-calendar-day-29'])[1]")));
		dobclick.click();

		//Thread.sleep(1000);
		passenger.click();
		//Thread.sleep(2000);
		adult.click();
		
		search.click();
	     fight.click();
	}
	

	private WebDriverWait WebDriverWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
