package adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //muudame programmi selliselt, et lubada kasutajal sisestada sõnu või fraase
    //liiguta kasutaja õigesse kohta vastavalt sisendile
    //määängija kkirjutab käskluse "Go west", "run south", "east", "please can I go north"
    //ja programm liigutab kasutaja õigesse kohta, kui see eksisteerib
    //kui tahab valesse kohta minna, siis jääb paigale
    //üksiktähti saab endiselt kasutada

    private static Map<Integer, Location> locations = new HashMap<>(); //Location meie klass mis just tegime
    public static void main(String[] args) {
        /*
        String myString = "Istud arvuti ees ja õpid Javat";
        String[] words = myString.split(" ");
        System.out.println(myString);
        for (String word : words) {
            System.out.println(word);
        }
        */

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Istud arvuti ees ja õpid Javat"));
        locations.put(1, new Location(1, "Seisad tänava alguses"));
        locations.put(2, new Location(2, "Seisad mäe otsas"));
        locations.put(3, new Location(3, "Seisad maja ees"));
        locations.put(4, new Location(4, "Seisad jõe ääres"));
        locations.put(5, new Location(5, "Seisad metsas"));

        //location 1
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);

        //location 2
        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        //location 3
        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);

        //location 4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        //location 5
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");



        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are "); //tavaline print
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", "); //tavaline print
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 0) { //not a single character command
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word); //ignoreerime sõnnu, mida pole vaja
                        //convertime nkn uppercase rida 83
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Can't go there");
            }

//            loc = scanner.nextInt();
//            if (!locations.containsKey(loc)) {
//                System.out.println("Cannot go there");
//            }
        }
    }
//Q - 0 (quit) võib konstruktorisse panna, kuna kõik locationid viitavad sellele

}
