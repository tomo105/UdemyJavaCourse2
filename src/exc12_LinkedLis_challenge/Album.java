package exc12_LinkedLis_challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String name, double duration) {
        if (returnIfExist(name) == null) {
            songs.add(new Song(name, duration));
            System.out.println("Added a song to album " + name);
            return true;
        } else {
            System.out.println(" You already have this song in this album.");
            return false;
        }
    }

    private Song returnIfExist(String title) {
        for (Song tempSong : this.songs) {
            if (tempSong.getTitle().equals(title)) {
                return tempSong;
            }
        }
        return null;
    }

    //                       od 1 do n !!! but in tab it is for 0 to n-1
    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        if (trackNumber >= 0 && trackNumber < this.songs.size()) {
            playlist.add(this.songs.get(trackNumber - 1));
            return true;
        } else {
            System.out.println("You do not have index " + trackNumber);
            return false;
        }
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song tempSong = returnIfExist(title);
        if (tempSong != null) {
            playlist.add(tempSong);
            return true;
        } else {
            System.out.println("You do not have this song " + title);
            return false;
        }
    }

}
