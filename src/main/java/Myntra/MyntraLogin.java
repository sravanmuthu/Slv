package Myntra;




import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyntraLogin
{
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Selenium\\chromedriver.exe");

// Initialize browser
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
// Open facebook
//        driver.get("https://www.google.co.in/");
//// Maximize browser
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@aria-label=\"Search\"]")).sendKeys("myntra");
//        driver.findElement(By.xpath("//*[@aria-label=\"Search\"]")).sendKeys(Keys.ENTER);
//
//        driver.findElement(By.xpath("(//*[contains(text(),'Myntra: Online')])[1]")).click();
//
//        driver.findElement(By.xpath("//*[@class=\"myntraweb-header-sprite desktop-iconWishlist sprites-headerWishlist\"]")).click();
//
//        driver.findElement(By.xpath("//*[@class=\"wishlistLogin-button\"]")).click();
//
//        driver.findElement(By.xpath("//*[@placeholder=\"Your Email Address\"]")).sendKeys("sravanmuthu@gmail.com");
//        driver.findElement(By.xpath("//*[@placeholder=\"Enter Password\"]")).sendKeys("Myntra@123");
//        driver.findElement(By.xpath("//*[@class=\"login-login-button\"]")).click();
//
        driver.get("https://www.myntra.com/login?");

        driver.findElement(By.xpath("//*[@placeholder=\"Your Email Address\"]")).sendKeys("sravanmuthu@gmail.com");
        driver.findElement(By.xpath("//*[@placeholder=\"Enter Password\"]")).sendKeys("Myntra@123");
        driver.findElement(By.xpath("//*[@class=\"login-login-button\"]")).click();

        WebElement ele = driver.findElement(By.xpath("//*[@class=\"myntraweb-header-sprite desktop-iconUser sprites-headerUser\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class=\"myntraweb-header-sprite desktop-iconUser sprites-headerUser\"]")).click();
        driver.findElement(By.xpath("//*[contains(text(),' Edit Profile ')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='bio']")).clear();
        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@name=\"mobile\"]")).sendKeys("9291535262");
        driver.findElement(By.xpath("//*[@name='bio']")).sendKeys("Test is test");
        driver.findElement(By.xpath("//*[contains(text(),' Confirm')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("desktop-searchBar")).sendKeys("10285165");
        driver.findElement(By.className("desktop-searchBar")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@class=\"size-buttons-unified-size\"] [text()='M']")).click();
        driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
        driver.findElement(By.xpath("//*[@class=\"desktop-userTitle\"] [text()='Bag']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Qty: ')]")).click();


        driver.findElement(By.xpath("//*[@class='dialogs-base-list']/div[text()='3']")).click();

//        Select select = new Select(qt);
//        select.selectByVisibleText("M");

        Thread.sleep(3000);

        driver.quit();


    }
}
