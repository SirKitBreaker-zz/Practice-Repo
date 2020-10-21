package session1;

public class Activity1_1 {

    public static void main(String[] args) {
	    // Object initialization
	    Car toyota = new Car();
		// Add default values
	    toyota.make = 2020;
	    toyota.color = "White";
	    toyota.transmission = "Automatic DCT";
	    toyota.modelNumber = "qpri134";
	    toyota.model = "Innova crysta";
	
		//Using Car class method
		toyota.displayCharacterstics();
		toyota.accelerate();
		toyota.brake();
    }

}
