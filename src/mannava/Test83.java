package mannava;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test83 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		// Get screenshot of page using ASHOT
		AShot as = new AShot();
		ShootingStrategy shs = ShootingStrategies.viewportPasting(1000);
		Screenshot ss = as.shootingStrategy(shs).takeScreenshot(driver);
		File dest = new File("fullPagesScreenshot.png");
		ImageIO.write(ss.getImage(),"PNG",dest);
		driver.close();
	}

}
