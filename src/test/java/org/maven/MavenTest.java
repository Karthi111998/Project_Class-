package org.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://twitter.com/i/flow/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement username = driver.findElement(By.name("text"));
username.sendKeys("karthi123");

WebElement bttn = driver.findElement(By.xpath("//div[@role='button']"));
bttn.click();
}
}
