package Transportationss;

public class SUV extends LandTransport {
    public SUV() {
        super(4);
    }

    @Override
    public String displayInfo() {
        return "I am an SUV with " + getWheels() + " wheels.";
    }
}