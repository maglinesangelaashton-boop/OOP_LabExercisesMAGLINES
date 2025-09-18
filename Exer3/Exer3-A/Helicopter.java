package Transportationss;

public class Helicopter extends AirTransport {
    public Helicopter() {
        super(1);
    }

    @Override
    public String displayInfo() {
        return "I am a Helicopter with " + getEngines() + " engine.";
    }
}