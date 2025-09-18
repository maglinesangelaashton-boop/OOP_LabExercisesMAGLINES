package Transportationss;

public class Submarine extends WaterTransport {
    public Submarine() {
        super("Nuclear Engine");
    }

    @Override
    public String displayInfo() {
        return "I am a Submarine powered by " + getPropulsion() + ".";
    }
}