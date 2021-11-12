package composition;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        this.theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        System.out.println("Fancy graphics");
        this.monitor.drawPixelAt(1200,1500,"green");
    }

//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
