package Transportationss;

public class AirTransport extends Transportation {
    private int engines;

    public AirTransport(int engines) {
        super("Air");
        this.engines = engines;
    }

    public int getEngines() {
        return this.engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    @Override
    public String displayInfo() {
        return "This is an Air Transport with " + this.engines + " engines.";
    }

}
