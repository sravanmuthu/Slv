package Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TimeDate
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Selenium\\chromedriver.exe");

// Initialize browser
        WebDriver driver = new ChromeDriver();
// Open datetime site
        driver.get("https://www.timeanddate.com/date/dateadd.html");
        driver.findElement(By.xpath("//*[@name=\"d1\"]")).click();
        driver.findElement(By.linkText("13")).click();

        driver.findElement(By.id("m1")).click();
        driver.findElement(By.linkText("07 - Jul")).click();

        driver.findElement(By.id("y1")).click();
        driver.findElement(By.linkText("2019")).click();

//Choose Add or Subtract
        Select diff = new Select(driver.findElement(By.id("type")));
        diff.selectByVisibleText("(–) Subtract");

        driver.findElement(By.id("ay")).click();
        driver.findElement(By.linkText("01")).click();

        driver.findElement(By.id("am")).click();
        driver.findElement(By.id("am")).sendKeys("03");

        driver.findElement(By.id("aw")).click();
        driver.findElement(By.id("aw")).sendKeys("01");

        driver.findElement(By.id("ad")).click();
        driver.findElement(By.id("ad")).sendKeys("8");

//Click on Include Time link
/*

        List<WebElement> elements=driver.findElements(By.tagName("a"));
        int totallinks=elements.size();
        for(int i=0; i< totallinks; i++)
        {
            String element= elements.get(i).getText();
            String av="Include the time";
            if(av.equals(element))
            {
                System.out.println("Time is link text");
            }
            else
            {
                System.out.println("Time is not a link text");
            }
        }
*/

//        WebElement timelink = driver.findElement(By.linkText("Include the time"));
//        String tmlnk = timelink.getText();


            if (driver.findElement(By.linkText("Includee the time")).isDisplayed())
//            if(timelink.isDisplayed())
            {
                WebElement timelink = driver.findElement(By.linkText("Include the time"));
                String tmlnk = timelink.getText();
                System.out.println("If condition block : " + tmlnk);
                timelink.click();
            }
            else
            {
                System.out.println("No link is there");
            }



//if clodding closed

/*

//Clicking on Submit button
        driver.findElement(By.id("subbut2")).click();

        Thread.sleep(3000);

//Option1 mostly used
        String rslt = driver.findElement(By.xpath("//*[contains(text(),'Result:')]")).getText();
        System.out.println("Your .."+rslt);

        WebElement dd = driver.findElement(By.xpath("//*[contains(text(),'Result:')]"));
        String value =  dd.getText();
        System.out.println("My Search .."+value);
//OPtion2
        Thread.sleep(8000);

        driver.quit();
*/


    }
}
