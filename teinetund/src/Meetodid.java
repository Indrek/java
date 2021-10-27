public class Meetodid {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 1500, levelCompleted, bonus);
        System.out.println(highScore);
        int lowScore = calculateScore(false, score, levelCompleted, bonus);
        System.out.println(lowScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Juku", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Juhan", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Maie", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScore("Kalle", highScorePosition);

//        if (score < 2000 && score > 1000) {
//            System.out.println("Sinu skoor on väiksem kui 2000 ja suurem kui 1000");
//        } else if (score < 1000) {
//            System.out.println("Skoor väiksem kui 1000");
//        } else {
//            System.out.println("Jõudsid siia");
//        }

    }
    //meetodid
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // kolmas sõna (int) näitab andmetüüpi, mis tuleb returnida. void puhul ei pea midagi returnima
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1; // -1 tavaliseltt errori puhul või kui väärtust ei leitud.
    }

    /*
    ülesanne:
    1) Tee uus meetod displayHighScorePosition (void)
    2) üks sisend on mängija nimi
    3) teine sisend positsioon, mis ta tabelis saavutas
    3.1) peaks kuvama teksti "nimi saavutas X koha tabelis"

    4) Teine meetod calculateHighScorePosition (int)
    5) Argument ainult mängija skoor
    6) Tagastab int väärtuse
    7) returnib andmed järgnevalt:
        1, kui skoor on suurem kui 1000
        2, kui skoor on suurem kui 500 või väiksem või võrdne 1000-ga
        3, kui skoor on suurem kui 100 või võiksem-võrdne 500-ga
        4, muudel juhtudel

    Testime numbritega 1500, 900, 400, 50
     */
    public static void displayHighScore(String name, int position) {
        System.out.println(name + " saavutas " + position + ". koha tabelis.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4; // eeldame, et väärtus on 4
        if (score > 1000) {
            position = 1;
        } else if (score > 500) {
            position = 2;
        } else if (score > 100) {
            position = 3;
        }
        return position;




//        if (score > 1000) {
//            return 1;
//        } else if (score > 500) {
//            return 2;
//        } else if (score > 100) {
//            return 3;
//        } else {
//            return 4;
//        }
    }



}
