package task17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// Launch the ChromeDriver Browser

		WebDriver driver = new ChromeDriver();

		// navigates to URL

		driver.get("https://www.snapdeal.com/");

		// maximize the window

		driver.manage().window().maximize();

		// navigates to sign in option

		driver.findElement(By.className("accountInner")).click();

		// login element

		WebElement open = driver.findElement(By.className("newUser"));

		open.click();

		// switching frame

		driver.switchTo().frame(0);

		// finding element for the email id

		WebElement emailId = driver.findElement(By.xpath("//input[@id='userName']"));

		emailId.sendKeys("sureshkarthik21@gmail.com");

		// Clicking the Continue option

		WebElement cont = driver.findElement(By.xpath("//button[@id='checkUser']"));

		cont.click();

		// Printing the OTP page element

		WebElement otp = driver.findElement(By.xpath("//div[@id='verifyEmailUC']"));

		System.out.println("Otp Sent to gmail Id:" + otp.getText());

		driver.close();

		// quits the whole browser

		driver.quit();

	}
}

// Output - OTP page - mailid-sureshkarthik21@gmail.com
