package Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTbl {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Selenium\\chromedriver.exe");

// Initialize browser
        WebDriver driver=new ChromeDriver();
// Open dynamic table
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(2000);

        //No.of Columns
        List<WebElement> col = driver.findElements(By.xpath("//*[@class=\"dataTable\"]/thead/tr"));
        System.out.println("No of col are: "+ col.size());

        //No.of rows
        List<WebElement> row = driver.findElements(By.xpath("//*[@class=\"dataTable\"]/tbody/tr"));
        System.out.println("No of rows are: " + row.size());


//Fetch specific data value
        WebElement bstbl = driver.findElement(By.tagName("table"));

        //To find third row of table
        WebElement tblrow = driver.findElement(By.xpath("//*[@class='dataTable']/thead/tr/th[3]"));
                String rowtxt = tblrow.getText();
                System.out.println("This is 3rd row data: "+rowtxt);

        //to get 3rd row's 2nd column data
        WebElement cellval = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
        String valofcell = cellval.getText();
        System.out.println("Cell value that i need is: "+valofcell);

        Thread.sleep(4000);
        driver.quit();
    }
}