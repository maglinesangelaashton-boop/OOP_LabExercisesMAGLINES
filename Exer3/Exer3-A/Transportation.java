package Transportationss;

public class Transportation {
    private String type; // land, air, water

    public Transportation(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String displayInfo() {
        return "This is a transportation of type: " + this.type;
    }
}