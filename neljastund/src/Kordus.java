public class Kordus {

    public static void main(String[] args) {
        // switch
        // for loop

        int num = 2;

        switch (num) {
            case 0:
                System.out.println("See on 0");
                break;
            case 1: case 2:
                System.out.println("See on 1 või 2");
                break;
            default:
                System.out.println("See pole 0, 1 ega 2");
                break;

        }
        System.out.println("Jõuti switchist välja");

        for(int i = 0; i < 10; i++) {
            System.out.println("Tsükkel: " + i);
            switch (i) {
                case 0: case 2: case 4: case 6: case 8: case 10:
                    System.out.println("number on paaris");
                    break;
                default:
                    System.out.println("number on paaritu");
            }
        }
    }
}
