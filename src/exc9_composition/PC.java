package exc9_composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    public void powerUp(){
        theCase.getPowerButton();
        drawLogo();

    }
    private void drawLogo() {
            monitor.drawPixelAt(123,23,"yellow");
    }

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
