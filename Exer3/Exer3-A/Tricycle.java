package Transportationss;

public class Tricycle extends LandTransport {
    public Tricycle() {
        super(3);
    }

    @Override
    public String displayInfo() {
        return "I am a Tricycle with " + getWheels() + " wheels.";
    }
}