import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.http.UrlPath;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import javax.swing.text.html.Option;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;

public class Homework19 {
    @BeforeMethod
    @Parameters({"BaseUrl"})
    public void launchBrowser(String BaseUrl){
        ChromeOptions options= new ChromeOptions();
        OptionsWithArguments.addArguments("--remote-allow-orgins=*");

        driver = new ChromeDriver(options);
        driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        url = BaseUrl;
        navigateToPage();
    }

    private void navigateToPage() {
        driver.get(Url);
    }

    @Test
    public void deletePlaylist() throws InterruptedException {
        String expectedPlaylistDeletedMessage = "Deleted playlist \"Testpro Playlist.\"";
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistenBtn();
        Assert.assertEquals(getDeletedPlaylistMsg(), expectedPlaylistDeletedMessage);

    }

    private void clickSubmit() {
        WebElement submit = driver.findElement(By.ByCssSelector("button[type='submit']"));
        submit.click();
    }


    private void providePassword(String te$t$tudent) {
        WebElement passwordField= driver.findElement(By.ByCssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);

    }

    private void provideEmail(String mail) {
        WebElement emailField = driver.findElement(By.ByCssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);
    }


    private void openPlaylist() {
        WebElement emptyPlaylist = driver.findElement(By.ByCssSelector(".playlist:nth-child(3)"));
        emptyPlaylist.click();
    }

    private void clickDeletePlaylistenBtn() throws InterruptedException {
        WebElement deletePlaylist = driver.findElement(By.ByCssSelector(".btn-delete-playlist"));
        deletePlaylist.click();
        Thread.sleep(2000);
    }

    private Object getDeletedPlaylistMsg() {
        WebElement notificationMsg = driver.findElement(By.ByCssSelector("div.success.show"));
        return notificationMsg.getText();
    }
    }

