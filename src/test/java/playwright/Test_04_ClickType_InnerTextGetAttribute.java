package playwright;

import org.testng.annotations.Test;
import com.microsoft.playwright.*;

public class Test_04_ClickType_InnerTextGetAttribute {

	@Test
	public void test_type_click_innerText() throws InterruptedException {
		 try (Playwright playwright = Playwright.create()) {
			 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
			 Page page = browser.newPage();		
			 page.navigate("http://demo.automationtesting.in/Register.html");
			
			 page.type("//input[@placeholder='First Name']", "Ram");
			 
			 page.click("//input[@id='checkbox1']");
			 System.out.println(page.innerText("div[class='container center'] h2"));
			 
			 page.pause();
	     }
	}
	
	@Test
	public void test_getAttribute() throws InterruptedException {
		 try (Playwright playwright = Playwright.create()) {
			 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
			 Page page = browser.newPage();		
			 page.navigate("https://www.rahulshettyacademy.com/AutomationPractice/");
			 page.type("//input[@id='name']", "David");	
			 Thread.sleep(4000);
			 //NOT Working 3/20/2021
			 System.out.println(page.getAttribute("//input[@id='name']", "value"));
			 
	     }
	}
}
