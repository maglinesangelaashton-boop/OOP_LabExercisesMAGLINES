package Transportationss;

public class TransportationTester {
    public static void main(String[] args) {
       
        Truck truck = new Truck();
        SUV suv = new SUV();
        Tricycle tricycle = new Tricycle();
        Motorcycle motorcycle = new Motorcycle();
        Kariton kariton = new Kariton();

        
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

       
        Boat boat = new Boat();
        Submarine submarine = new Submarine();

      
        System.out.println(truck.displayInfo());
        System.out.println(suv.displayInfo());
        System.out.println(tricycle.displayInfo());
        System.out.println(motorcycle.displayInfo());
        System.out.println(kariton.displayInfo());

        System.out.println(airplane.displayInfo());
        System.out.println(helicopter.displayInfo());

        System.out.println(boat.displayInfo());
        System.out.println(submarine.displayInfo());
    }
}