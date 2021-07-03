import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mstefanov\\Documents\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://djinni.co/");
        driver.manage().window().maximize();
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Get Started')]"))));

     element.findElement(By.xpath("//*[contains(text(),'Get Started')]"));
        Assert.assertEquals(element, "Get Started");
        driver.quit();
    }
}
