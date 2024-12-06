package week4.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	

			public static void main(String[] args) throws InterruptedException {
				ChromeDriver cd=new ChromeDriver();
				cd.manage().window().maximize();
				cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				//Switch focus to frame
						
				cd.switchTo().frame("iframeResult");
				
				cd.findElement(By.xpath("//button[text()='Try it']")).click();
				
				//Switch focus to alert			
				Alert alert = cd.switchTo().alert();
				String alertInput = "Test user";
	            alert.sendKeys(alertInput);
				alert.accept();
				
								
				String text = cd.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println(text);
				
			}

}

