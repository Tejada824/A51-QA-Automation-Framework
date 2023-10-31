import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong() {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickUbmit();
        clickPlay();
        Assert.asserTrue(isSongPlaying());
    }
    public void clickPlay() {
        WebElement playNextButton = Driver.findElement(By.xpath(xpathExpression: "//i[@data-testid='play-next-btn']"));
        WebElement playButton = Driver.findElement(By.xpath(xpathExpression: "//span[@data-testid='play-btn']"));

        playNextButton.click();
        playButton.click();
    }
    public boolean isSongPlaying() {
        WebElement soundBar = driver. findElement(By.ByXPath(xpathExpression:"//div[@data-testid='sound-bar-play']" ));
        return soundBar.isDisplayed();
    }

}