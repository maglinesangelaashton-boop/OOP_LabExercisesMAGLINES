package Transportationss;

public class WaterTransport extends Transportation {
    private String propulsion; // sail, motor, etc.

    public WaterTransport(String propulsion) {
        super("Water");
        this.propulsion = propulsion;
    }

    public String getPropulsion() {
        return this.propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public String displayInfo() {
        return "This is a Water Transport powered by " + this.propulsion + ".";
    }
}