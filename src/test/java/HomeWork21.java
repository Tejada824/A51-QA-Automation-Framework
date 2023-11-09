import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork21 {
    String newPlaylistName = "Sample Edited Playlist";

    @Test
    public void renamePlaylist(){
        String updatedPlaylistmsg = "Updated Playlist \"Sample Edited Playlist.\"";

        providedEmail("demo@class.com");
        providedPassword("te$t$tudent");
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(),updatedPlaylistmsg);
    }
}
