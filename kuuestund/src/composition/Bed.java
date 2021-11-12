package composition;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int blankets;

    public Bed(String style, int pillows, int height, int sheets, int blankets) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.blankets = blankets;
    }

    public void make() {
        System.out.println("Making bed");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getBlankets() {
        return blankets;
    }
}
