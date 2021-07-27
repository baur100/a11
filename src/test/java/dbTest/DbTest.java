package dbTest;

import helpers.DbAdapter;
import models.Playlist;
import models.PlaylistSongs;
import org.testng.annotations.Test;

import java.util.List;

public class DbTest {
    @Test
    public void getPlaylistForUser() {
        List<Playlist> pls = DbAdapter.getUsersPlaylists(161);
        for (Playlist pl : pls) {
            System.out.println(pl.getName() + " " + pl.getId());
        }
    }
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistById(972);
        System.out.println(pl.getName());
    }

    @Test
    public void getPlaylistSongs(){
        List<PlaylistSongs> songs = DbAdapter.getPlaylistSongs(972);
        for(PlaylistSongs song:songs){
            System.out.println(song.getTrack()+" - "+song.getTitle()+" - "+song.getArtist()+" - "+song.getAlbum());
        }
    }
}
