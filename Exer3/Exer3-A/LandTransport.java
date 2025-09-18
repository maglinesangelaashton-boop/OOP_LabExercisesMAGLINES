package Transportationss;

public class LandTransport extends Transportation {
    private int wheels;

    public LandTransport(int wheels) {
        super("Land");
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String displayInfo() {
        return "This is a Land Transport with " + this.wheels + " wheels.";
    }
}
