package exc14_inner_classes_challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    //private ArrayList<Song> songs;
    private SongList songs; //

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        // this.songs = new ArrayList<Song>();
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public boolean addSong(String name, double duration) {
        // songs.add(new Song(name, duration));
        return this.songs.addSong(new Song(name, duration));
    }

//    private Song returnIfExist(String title) {
//        for (Song tempSong : this.songs.songs) {
//            if (tempSong.getTitle().equals(title)) {
//                return tempSong;
//            }
//        }
//        return null;
//    }

    //                       od 1 do n !!! but in tab it is for 0 to n-1
    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        Song checkSong = this.songs.findSong(trackNumber);
        if(checkSong != null) {
            playlist.add(checkSong);
            return true;
        } else {
            System.out.println("You do not have index " + trackNumber);
            return false;
        }
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song tempSong = this.songs.findSong(title);
        if (tempSong != null) {
            playlist.add(tempSong);
            return true;
        } else {
            System.out.println("You do not have this song " + title);
            return false;
        }
    }


    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public Boolean addSong(Song song) {
            if (!this.songs.contains(song)) {
                songs.add(song);
                System.out.println("added song to SongList");
                return true;
            } else {
                System.out.println("You already have this song in SongList");
                return false;
            }
        }

        private Song findSong(String title) {
            for (Song tempSong : this.songs) {
                if (tempSong.getTitle().equals(title)) {
                    return tempSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber > 0 && trackNumber <= this.songs.size()) {
                return this.songs.get(trackNumber - 1);
            } else {
                System.out.println("You do not have index " + trackNumber);
                return null;
            }
        }
    }
}
