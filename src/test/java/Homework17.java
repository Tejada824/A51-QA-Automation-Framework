import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 {
    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String expectedSongAddedMessage = "Added 1 song into \"Test Pro Playlist.\"";
        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep( millis: 2000);
        SearchSong( name: "ketsa");
        ClickViewAllBtn();
        selectFirstSongResult();
        ClickAddToBtn();
        cchoosePlaylist();
        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessage);
        }
