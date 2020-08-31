package appiumtests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Calculator extends BaseClass{

	@Test
	public void testCalculator() {
		
	MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
	MobileElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
	MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
	MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
	MobileElement result = driver.findElement(By.className("android.widget.EditText"));
	
	
	
	
	two.click();
	plus.click();
	three.click();
	equals.click();
	
	String res= result.getText();
	System.out.println("\n Result is: "+res);
	System.out.println("Completed...");
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit(); // Cierra el navegador una vez completa la prueba
	}
}
