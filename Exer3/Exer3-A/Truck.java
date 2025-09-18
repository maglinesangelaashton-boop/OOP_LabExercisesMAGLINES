package Transportationss;

public class Truck extends LandTransport {
    public Truck() {
        super(6);
    }

    @Override
    public String displayInfo() {
        return "I am a Truck with " + getWheels() + " wheels.";
    }
}