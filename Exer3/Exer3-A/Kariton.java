package Transportationss;

public class Kariton extends LandTransport {
    public Kariton() {
        super(2);
    }

    @Override
    public String displayInfo() {
        return "I am a Kariton (push cart) with " + getWheels() + " wheels.";
    }
}