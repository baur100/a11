package dbTest;

import helpers.DbAdapter;
import models.Album;
import models.Artist;
import models.Playlist;
import org.testng.annotations.Test;

import java.util.List;

public class DbTest {
    @Test
    public void getAllArtists(){
        List<Artist> res = DbAdapter.getAllArtists();
        for (Artist artist: res){
            System.out.println(artist.getNumber()+" "+artist.getName());
        }
    }
    @Test
    public void getAllAlbums(){
        List<Album> res = DbAdapter.getAllAlbums();
        for (Album albs: res){
            System.out.println(albs.getArtistId()+" "+albs.getId()+" "+albs.getName()+" "+albs.getCover());
        }
    }
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistById(2989);
        System.out.println(pl.getName());
    }
}
