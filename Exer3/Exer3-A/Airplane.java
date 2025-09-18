package Transportationss;

public class Airplane extends AirTransport {
    public Airplane() {
        super(2);
    }

    @Override
    public String displayInfo() {
        return "I am an Airplane with " + getEngines() + " engines.";
    }
}
