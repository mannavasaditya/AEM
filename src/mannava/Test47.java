package mannava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test47 
{
	// program to work on dropdown with country selection
	public static void main(String[] args) throws Exception
	{
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdpwn.hyml");
		Thread.sleep(5000);
		
		// locate<div>> tag dropdown and get it into visible area of desktop
		//via a neighbour element
		WebElement neighbor = driver.findElement(By.xpath("//h4[text()='Search Selection']"));
		driver.executeScript("arguments[0].scrollIntoView();", neighbor);
		WebElement dd = neighbor.findElement(By.xpath("following-siblings::div"));
		
		// Test case-1 check for single select or not
		if(dd.getAttribute("class").contains("multiple"))
		{
			System.out.println("Multiple select dropdown");
			// Stop testing
		}
		else
		{
			System.out.println("Single select dropdown");
			// Start testing
			// Test case 2 to collect all items in that single select dropdown and display
			List<WebElement> items = dd.findElements(By.xpath("child::div[2]/div"));
			System.out.println("Count of items in drodown is "+items.size());
			System.out.println("Items are: ");
			for(WebElement item:items)
			{
				// get hidden iems text using Javascript
				String str = (String) driver.executeScript("return(arguments[0].textContent);", item);
				System.out.println(str);				
			}
			
			// Test case 3 select each item and test the selection
			for(WebElement item:items)
			{
				try
				{
					// 1. open dropdown to get visibility of item
					dd.click();
					Thread.sleep(1000);
					
					// 2 check item for visibility
					if(item.isDisplayed())
					{
						// 3. Remember the text of that item to be selected
						String expected = item.getText();
						
						// 4. Select that item
						item.click();
						Thread.sleep(1000);
						// 5. get selected item text
						String actual = dd.findElement(By.xpath("child::div[1]")).getText();
						// 6. compare the actual and expected text
						if(expected.equals(actual))
						{
							System.out.println(expected + " Item selected test passed");							
						}
						else
						{
							System.out.println(expected + " Item selected test failed");							
						}
					}
					else 
					{
						String y =(String) driver.executeScript("return(arguments[0].textContent)", item);
						System.out.println(y + " Item is hidden");							
					}
				}// end of try
				catch (Exception ex) 
				{	
					System.out.println(ex.getMessage());							
				}//end of catch
			}// end of for each
		
		}// end of if condition
		//closing the site driver
		driver.close();
	}
}
