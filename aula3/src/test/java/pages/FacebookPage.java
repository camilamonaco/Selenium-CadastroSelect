package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	static WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherComboBox() {
		
		Select dia = new Select(driver.findElement(By.id("day")));
		dia.selectByValue("11");
		
		Select mes = new Select(driver.findElement(By.id("month")));
		mes.selectByValue("6");
		
		Select ano = new Select(driver.findElement(By.id("year")));
		ano.selectByValue("1984");
	}
}
