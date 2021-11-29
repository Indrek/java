package innerclasses;

public class Main {

    //Inner classes
    //4 tüüpi
    //static
    //non-static
    //local (meetodi sees)
    //anonüümne

    //käigukast ja käigud

    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//        Gearbox.Gear second = new GearBox.Gear(2, 15.4); //error
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.8); //error
//        System.out.println(first.driveSpeed(1000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }

}
