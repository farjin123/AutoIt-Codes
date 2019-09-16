package com.model;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upfilechrome1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("auto it git hub");
		System.setProperty("webdriver.chrome.driver", "G:\\Mams lecture practicals\\selenium exes file and jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/AutoIT/AutoData/upload1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("G:\\AutoIT\\AutoData\\fileup1.exe");
		

	}

}
