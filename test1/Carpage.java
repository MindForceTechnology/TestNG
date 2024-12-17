package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carpage {
	public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.set(new ChromeDriver());
		

		driver.get().manage().window().maximize();
		Thread.sleep(4000);
		driver.get().get("https://automationexercise.com");
		driver.get().findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.get().findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("shivaprakash500@gmail.com");
		driver.get().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Account123!!");

		driver.get().findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Test
	public void  kidsCart() throws InterruptedException {

//driver.navigate().refresh();

		driver.get().findElement(By.xpath("(//span[@class='badge pull-right'])[3]")).click();
		JavascriptExecutor NoElementisInteractable = (JavascriptExecutor) 
				driver.get();
		NoElementisInteractable.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.get().findElement(By.xpath("//div[@id='Kids']//a[contains(text(),'Dress')]")).click();
		driver.get().findElement(By.xpath("(//a[@href='/brand_products/Babyhug'])[1]")).click();
		driver.get().findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[7]"))
				.click();

//driver.switchTo().alert().accept();
//button[@data-dismiss='modal'][normalize-space()='Continue Shopping']
	}

	@Test
	public void menCart() throws InterruptedException {
//driver.navigate().refresh();
		driver.get().findElement(By.xpath("//a[normalize-space()='Men']")).click();
		JavascriptExecutor NoElementisInteractable = (JavascriptExecutor) driver.get();
		NoElementisInteractable.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.get().findElement(By.xpath("//a[normalize-space()='Jeans']")).click();
		driver.get().findElement(By.xpath("(//a[@href='/brand_products/Allen Solly Junior'])[1]")).click();
		driver.get().findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[3]"))
				.click();

	}

	@Test
	public void womenCart() throws InterruptedException {
//driver.navigate().refresh();
		driver.get().findElement(By.xpath("//a[normalize-space()='Women']")).click();
		JavascriptExecutor NoElementisInteractable = (JavascriptExecutor) driver.get();
		NoElementisInteractable.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.get().findElement(By.xpath("//a[normalize-space()='Tops']")).click();
		driver.get().findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();
		driver.get().findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]"))
				.click();

	}

}
