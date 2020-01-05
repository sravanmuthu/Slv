package Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateCalc {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Selenium\\chromedriver.exe");

// Initialize browser
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
// Open facebook
        driver.get("https://www.calculator.net/date-calculator.html");

        WebElement dt = driver.findElement(By.xpath("//*[@class=\"calendarDateInput\" and @id=\"today_Month_ID\"]"));

        Select select = new Select(dt);
        select.selectByValue("10");
        Thread.sleep(3000);

        WebElement vtxt = driver.findElement(By.xpath("(//*[text()='Date Calculator'])[2]"));

        if (vtxt.isDisplayed())
        {
            System.out.println("Month displayed.. "+vtxt.getText());
        }
        else
            System.out.println("Elem Not captured");

        Thread.sleep(3000);
//        driver.quit();
    }
}
