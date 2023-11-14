public class Homework23 {
    public class ActionsTests extends BaseTest {
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongs = new AllSongsPage(driver);

         loginPage.provideEmail("demo@class.com");
         loginPage.providePassword("te$t$tudent");
         loginPage.clickSubmit();
         loginPage.provideEmail("demo@class.com");
                  .providePassword("te$t$tudent");
                  .clickSubmit();h
        homePage.chooseAllSongsList();
        allSongs.contextClickFirstSong();
        allSongs.choosePlayOption();
        Assert.assertTrue(allSongs.isSongPlaying());

        allSongs.contextClickFirstSong()
                .

        choosePlayOption();

        Assert.assertTrue(allSongs.isSongPlaying();
    }
}
        public class AllSongsPage extends BasePage {

            @FindBy(css = ".all-songs tr.song-item:nth-child(1)")
            WebElement firstSong;
            @FindBy(css = "li.playback")
            WebElement playOption;

            @FindBy(css = "[data-testid='sound-bar-play']")
            WebElement soundBarVisualizer;

            public AllSongsPage(WebDriver givenDriver) {
                super(givenDriver);
            }

            public AllSongsPage contextClickFirstSong() {
                super.contextClick(firstSong);
                return this;
            }

            public AllSongsPage choosePlayOption() {
                super.click(playOption);
                return this;
            }

            public boolean isSongPlaying() {
                return findElement(soundBarVisualizer).isDisplayed();
            }
        }