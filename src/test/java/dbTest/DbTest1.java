package dbTest;

import helpers.DbAdapter1;
import models.Artist1;
import models.Album1;
import models.Playlist1;
import org.testng.annotations.Test;

import java.util.List;

public class DbTest1 {
    @Test
    public void getAllArtists(){
        List<Artist1> res = DbAdapter1.getAllArtists();
        for (Artist1 artist : res){
            System.out.println(artist.getNumber()+ " " + artist.getName());
        }
    }
    @Test
    public void getAllAlbums(){
        List<Album1> res = DbAdapter1.getAllAlbums();
        for (Album1 albs : res){
            System.out.println(albs.getArtistId()+ " " + albs.getId()+ " " + albs.getName()+ " " +albs.getCover());
        }
    }
    @Test void getPlaylistById(){
        Playlist1 pl = DbAdapter1.getPlaylistById(6012);
        System.out.println(pl.getName());

    }
}
