package static_ja_final;

public class SomeClass {
    //final tavaliselt kasutatakse konstantite puhul. Neid saab muuta ainult 1 korra
    // enne, kui klassi konstruktor on lõpetanud.
    //saab muuta esmasel deklareerimisel või konstruktori sees.

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
