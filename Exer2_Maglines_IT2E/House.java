public class HouseTester {
	
	    public static void main(String[] args) {
	        // Create House objects
	        House h1 = new House("White", "3", "123 Main St", "Mr. Cruz", "200 sqm");
	        House h2 = new House("Blue", "5", "456 Oak Ave", "Mrs. Reyes", "350 sqm");

	        // Display their information
	        h1.displayInfo();
	        h2.displayInfo();
	    }
}
