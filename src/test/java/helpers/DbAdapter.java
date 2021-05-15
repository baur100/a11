package helpers;


import models.Playlist;
import models.PlaylistSongs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private final static String USERNAME ="dbuser01";
    private final static String PASSWORD = "pa$$01";
    private final static String JOBC_DRIVER = "org.mariadb.jdbc.Driver";
    private final static String DB_URL = "jdbc:mariadb://104.237.13.60/dbkoel";

    private static Connection connection = null;
    private static Statement statement = null;

    public static List<Playlist> getUsersPlaylists(int userId)  {
        List<Playlist> playlists = new ArrayList<>();
        String query = "SELECT * FROM dbkoel.playlists p where user_id ="+userId;
        try {
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(query);
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                Playlist pl = new Playlist(id,name);
                playlists.add(pl);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return playlists;

    }

    public static Playlist getPlaylistById(int playlistId)  {
        Playlist playlist = null;
        String query = "SELECT * FROM dbkoel.playlists p where id ="+playlistId;
        try {
            Class.forName(JOBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(query);
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                playlist = new Playlist(id,name);

            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return playlist;

    }

    public static List<PlaylistSongs> getPlaylistSongs(int playlistId)  {
        List<PlaylistSongs> songs = new ArrayList<>();
        String query = "SELECT s.track AS track, s.title AS title, a.name AS artist, a.name AS album FROM ((((dbkoel.playlists p INNER JOIN dbkoel.playlist_song ps ON p.id=ps.playlist_id) INNER JOIN dbkoel.songs s ON s.id=ps.song_id) INNER JOIN dbkoel.artists a ON s.artist_id =a.id) INNER JOIN dbkoel.albums a2 ON s.album_id =a2.id) WHERE p.id ="+playlistId;
        try {
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(query);
            while (res.next()){
                int track = res.getInt("Track");
                String title = res.getString("Title");
                String artist = res.getString("artist");
                String album = res.getString("album");
                PlaylistSongs song = new PlaylistSongs(track,title,artist,album);
                songs.add(song);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return songs;

    }
}
