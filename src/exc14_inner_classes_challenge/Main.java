package exc14_inner_classes_challenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album hybridTheory = new Album("Hybrid Theory", "Linkin Park");

        hybridTheory.addSong("Crawling", 3.28);
        hybridTheory.addSong("Points of Authority", 3.20);
        hybridTheory.addSong("By Myself", 3.10);
        hybridTheory.addSong("In the End", 3.36);
        hybridTheory.addSong("Runaway", 3.04);

        albums.add(hybridTheory);

        Album billyTalent = new Album(" Billy Talent", "Billy Talent");
        billyTalent.addSong("Line & Sinker", 3.37);
        billyTalent.addSong("This Is How It Goes", 3.27);
        billyTalent.addSong("Lies", 3.25);
        billyTalent.addSong("Try Honesty", 4.13);

        albums.add(billyTalent);

        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist("Lies", playList);
        albums.get(1).addToPlaylist("Across the line", playList);
        albums.get(0).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(11, playList);

        play(playList);

    }

    private static void play(List<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean goForward = true;
        Scanner sc = new Scanner(System.in);

        if (playList.size() == 0) {
            System.out.println("No songs to play");
        } else {
            System.out.println("You have " + playList.size() + " songs in your playList");
            System.out.println("Now playing " + listIterator.next().toString());
            while (!quit) {
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 0:
                        printInstruction();
                        break;
                    case 1:  //change to next song
                        if (!goForward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            goForward = true;
                        }
                        if (listIterator.hasNext()) {
                            System.out.println("Playing song: " + listIterator.next().toString());
                        } else {
                            System.out.println("you reach end of playList");
                            goForward = false;
                        }
                        break;
                    case 2:  //go back
                        if (goForward) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            goForward = false;
                        }

                        if (listIterator.hasPrevious()) {
                            System.out.println("Playing song: " + listIterator.previous().toString());
                        } else {
                            System.out.println("Can't go further back.");
                        }
                        break;
                    case 3:
                        if (goForward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now playing" + listIterator.previous().toString());
                                goForward = false;
                            } else {
                                System.out.println("we are at start of list");
                            }
                        } else {
                            if (listIterator.hasNext()) {
                                System.out.println("Now playing" + listIterator.next().toString());
                                goForward = true;
                            } else {
                                System.out.println("We reach the end of list");
                            }
                        }
                        break;
                    case 4:
                        printList(playList);
                        break;
                    case 5:
                        quit = true;
                        break;
                    case 6:
                        if (playList.size() > 0) {
                            listIterator.remove();
                            if (listIterator.hasNext()) {
                                System.out.println("now playing " + listIterator.next());
                                goForward = true;
                            } else if (listIterator.hasPrevious()) {
                                System.out.println("now playing " + listIterator.previous());
                                goForward = false;
                            }
                        } else {
                            System.out.println("you don't have songs int his album");
                        }
                        break;
                }
            }
        }

    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        // or this
//        for (Song song : playList) {
//            System.out.println("Title " + song.getTitle() + " duration: " + song.getDuration());
//        }
    }

    private static void printInstruction() {
        System.out.println("press 0 to see instructions");
        System.out.println("Press 1 to listen next song");
        System.out.println("Press 2 to go back to previous song");
        System.out.println("Press 3 to replay song ");
        System.out.println("Press 4 to print songs");
        System.out.println("Press 5 to end");
    }
}