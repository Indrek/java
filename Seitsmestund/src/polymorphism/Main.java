package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String plot() {
        return "No plot here.";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "Shark eats people";
    }
}
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape maze";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Rebels fight imperial forces";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    //siia plotti ei tule.
}

public class Main {
    //Polümorfismi idee on see, et see kirjeldab endale unikaalset käitumist
    // ning samal ajal jagab ülemklassi mingit funktsionaalsust.
    // Selleks, et polümorfismi saavutada, tuleb kasutada vähemalt ühte ülemklassi meetodit.
    // See lubab kasutada sama koodi ja funktsioone erinevate andmetüüpidega,
    // mille tulemuseks on rohkem üldised ning abstraktsed implementatsioonid.

    public static void main(String[] args) {

        for(int i = 1; i< 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1; // Math.random() annab double'i 0 ja 1 vahel.
        System.out.println("Random nr generated was " + randomNumber);


        switch (randomNumber) {
            case 1:
                return new Jaws();
                //break pole vaja,  kuna return juba hüppab switchist (ja meetodist) välja
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
//        return null; // ei ole 0; tühi, mitte midagi;

    }
}
