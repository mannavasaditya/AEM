package mannava;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test22 {
	// broken links on a page.
	public static void main(String[] args) throws Exception {
		// Testing broken link - open browser and launch site [gui test using SWD]
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");
		Thread.sleep(5000);// time in milisec

		// collect all link type elements in home page
		List<WebElement> listElements = driver
				.findElements(By.xpath("(//image)|(//link)|(//area)|(//a)|(/script)|(//base)|(//div)"));// "//*" - all
																										// tags if we
																										// use this the
																										// performance
																										// is low
		// href address value tesing or broken link testing [API test usig JDK Classes]]

		// goto each one via looping
		int cwl = 0; // count correctly working links
		int bl = 0;// broken links
		int totallinks = 0;
		for (WebElement e : listElements) {
			try {// to handle any exception and continue loop
					// test case-1: whether that elements has href attribute or not if an element
					// has href attribute that element is called hyperlinks
				if (e.getAttribute("href") != null) {
					String x = e.getAttribute("href");
					// test case -2 whether that href value is URL [address] or not, some elements
					// href attribute value[not a url] refer local page only.
					if (x.startsWith("http") || x.startsWith("https")) {
						// tesst case 3 - whether that url related server is responding or not
						totallinks++;
						URL u = new URL(x);
						HttpURLConnection con = (HttpURLConnection) u.openConnection();
						con.connect();
						String y = con.getResponseMessage();
						int z = con.getResponseCode();
						con.disconnect();
						// checking with status response code
						if (z >= 200 && z <= 299)
							cwl++;
						else {
							bl++;
							System.out.println(x + " send " + y + " with " + z);
						}
					}
				}
			} 
			catch (Exception ex) 
			{
				System.out.println(ex.getMessage());
			}
		}// end of loop completion
		System.out.println("Total Links coun is "+totallinks);
		System.out.println("Correctly working links are"+cwl);
		System.out.println("broken links are "+bl);
		driver.close();
	}
}