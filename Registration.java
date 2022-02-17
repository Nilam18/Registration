package registrationpage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Nilam");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Sharma");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

       Select select = new Select(day);
       select. selectByIndex(14);
       Select select1 = new Select(Month);
       select1. selectByVisibleText("January");
        Select select2 = new Select(year);
        select2. selectByVisibleText("2022");

        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("nharma18@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Sharma&co");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Password123");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Password123");

        driver.findElement(By.id("register-button")).click();
    }
}
