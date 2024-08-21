package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://wma.hcl.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.id("i0116")).sendKeys("victor.damasio@hcltech.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div[2]/input")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.name("passwd")).sendKeys("Hcl.2022d");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
		
	}
}