package Transportationss;

public class Motorcycle extends LandTransport {
    public Motorcycle() {
        super(2);
    }

    @Override
    public String displayInfo() {
        return "I am a Motorcycle with " + getWheels() + " wheels.";
    }
}
