package composition;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        //uue muutujaga (Dimensions)


        Monitor theMonitor = new Monitor("27 inch", "Acer",
                27, new Resolution(2540, 1440));
        //otse initseerimisel (Resolution)

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 10"); //getter PC klassis saab kätte Motherboardi
//        //Motherboardis on meetod.
//        thePC.getTheCase().pressPowerButton();

        System.out.println("********************************************");

        thePC.powerUp();

        //challenge:
        // Tee 1 tuba majas, kasutades kompositsiooni
        // Füüsilised osad toast + mööbel

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(3, 45);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false);

        Bedroom bedRoom = new Bedroom("Juku", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

        Bedroom newBedRoom = bedRoom;

        System.out.println(bedRoom.getLamp().getStyle());
        System.out.println(newBedRoom.getLamp().getStyle());
    }
}
