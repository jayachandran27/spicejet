package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Utility;

public class Baseclass extends Utility {
	@BeforeMethod
	
	public void startup() throws IOException, InterruptedException {
		driver = intitalizedriver();
		driver.get(pro.getProperty("url"));
	
		
		
		
	}
@AfterMethod
	public void close()   {
		driver.quit();

	}

}
