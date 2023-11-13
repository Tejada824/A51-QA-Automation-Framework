import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BaseTest {

    @Test
    public void renamePlaylist() {
        String newPlaylistName = "Test pro Edited Playlist";
        String updatedPlaylistMsg = " Updated playlist \"Test Pro Edited Playlist.\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomPage(driver);

        LoginPage.login();
        homePage.doubleClicklaylist();
        homePage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(homePage.getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);
    }
}