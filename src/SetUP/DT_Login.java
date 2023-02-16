package SetUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DT_Login
{
    static WebDriver  driver;

    public static void setup() throws Exception
    {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("launched Firfoxe Driver");
        driver.get("https://dt-admin-staging.deaftawk.com/auth/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait waits = new WebDriverWait(driver, 3000);
        waits.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
        Thread.sleep(300);
    }

}
