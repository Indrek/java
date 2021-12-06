package static_ja_final;

public class StaticTest {
    private static int  numInstance = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstance++;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}
