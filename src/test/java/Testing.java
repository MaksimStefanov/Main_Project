import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Testing {
    public static void main(String[] args) {
       /* WebDriver driver = new ChromeDriver();
        WebElement element =
                (new WebDriverWait(driver, Duration.ofSeconds(10))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("e"))));
       WebDriverWait wait = new WebDriverWait(driver,1000);
        driver.get("gghd");
        element.sendKeys();
        WebElement element1 = driver.findElement(By.xpath("erf"));
        Alert alert = wait.until(alertIsPresent());
        alert.accept();*/
        int a, s;
        a = 10;
        s = 12;
        Assert.assertEquals(a, s);
    }
}