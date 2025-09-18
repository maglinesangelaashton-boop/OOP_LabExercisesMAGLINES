package Transportationss;

public class Boat extends WaterTransport {
    public Boat() {
        super("Sail");
    }

    @Override
    public String displayInfo() {
        return "I am a Boat powered by " + getPropulsion() + ".";
    }
}