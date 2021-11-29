package kodutoo;


import java.util.*;

public class Main {

    //Teeme programmi, mis implementeerib laulude playlisti
    //Teeme Song klassi, millel on tiitel ja pikkus (title, duration)
    //Teeme Album klassi, mis omab listi lauludest (+ nimi + esitaja)
    //Albumid storeme ArrayListi
    //Laulud erinevatest albumitest saab lisada playlisti
    //ja on selles järjekorras, kuidas nad playlisti lisati
    //Kui laulud on playlisti lisatud, tee menüü:
    //Quit, Skip forward, skip backward, replay
    //List playlistis olevatest lauludest
    //Laul peab eksisteerima albumis enne, kui teda playlisti saab lisada

    //Vihje: et kui lugusid replayda, siis mis juhtus, kui pendeldasime 2 linna vahel
    //eelmises ülesandes (linkedlist) (enne, kui hakkasime directionit trackima)
    //boonus: lisa võimalus lugusid playlistist eemaldada (listIterator.remove())

    private static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Why Try Harder - The Greatest Hits", "Fatboy Slim");
        album.addSong("Praise You",3.75);
        album.addSong("Weapon of Choice",3.7);
        album.addSong("Right Here Right Now", 3.9);
        album.addSong("Ganger Trippin", 3.7);
        album.addSong("Wonderful Night", 2.75);
        album.addSong("Slash Dot Dash", 2.95);
        album.addSong("Demons", 3.25);
        albums.add(album);

        album = new Album("Immersion", "Pendulum");
        album.addSong("Witchcraft",4.25);
        album.addSong("Watercolour",5.1);
        album.addSong("The Island, Pt. I(Dawn)",5.3);
        album.addSong("Crush",4.25);
        album.addSong("Self vs Self",4.75);
        albums.add(album);

        List<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Praise You", playList);
        albums.get(0).addToPlaylist("Right Here Right Now", playList);
        albums.get(0).addToPlaylist("Eat Sleep Rave Repeat", playList); //pole olemas
        albums.get(0).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(24, playList); //pole olemas

        Song song = new Song("Voodoo People", 5.1);
        song.addToPlaylist(playList);

        play(playList);
    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing - " + listIterator.next().toString()); //.toString() ei ole kohustuslik
        }
        printMenu();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1: //forward
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2: //tagasi
                    if (forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached start of playlist");
                        forward = true;
                    }
                    break;
                case 3: //replay
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached start of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached end of playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6: //remove
                    if(playList.size() > 0) {
                        listIterator.remove(); //iga kord, kui remove paneme, peame .next()
                        // või .previous() panema. muidu error
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        } else {
                            System.out.println("Deleted last song. Playlist is now empty.");
                        }
                    } else {
                        System.out.println("Unable to delete, playlist is empty. Quitting");
                        quit = true;
                    }
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println( "0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - remove song from playlist");
    }
    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator(); //tavaline iteraator, ei saa tagasi minna.
        System.out.println("========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); //.toString() võib panna, aga see on default (vaikimisi)
        }
        System.out.println("========================");
    }
}
