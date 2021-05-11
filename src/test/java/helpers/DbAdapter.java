package helpers;



import models.Album;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.13.60/dbkoel";
    private static final String USER = "dbuser03";
    private static final String PASSWORD = "pa$$03";

    private static Connection connection = null;
    private static Statement statement = null;


    public static List<Artist> getAllArtists(){
        List<Artist> artists = new ArrayList<>();
        String query = "select * FROM artists a ";
        try{
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int number = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Artist artist = new Artist(number, name);
                artists.add(artist);
            }

        } catch (SQLException err){}

        return artists;
    }
    public static List<Album> getAllAlbums(){
        List<Album> albums = new ArrayList<>();
        String query = "select * FROM albums a2";
        try{
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int artId = resultSet.getInt("artist_id");
                String name = resultSet.getString("name");
                String cover = resultSet.getString("cover");
                Album album = new Album(id,artId, name,cover);
                albums.add(album);
            }

        } catch (SQLException err){}

        return albums;
    }
}
