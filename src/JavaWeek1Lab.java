
public class JavaWeek1Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 5;
//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 105.83;
//create a variable to hold a persons middle initial
		char middleNameInitial = 'C';
//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
//create a variable to hold a customers first name
		String firstName = "Isaac";
//create a variable to hold a street address
		String streetAddress = "9999 Police Box Way SW";
//print all variables to the console
		System.out.println(availablePlaneSeats);
		System.out.println(costOfGroceries);
		System.out.println(middleNameInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println("The Doctors Tardis is parked at " + streetAddress);
		
//a customer booked two plane seats, remove two plane seats from the available plane seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
//can also say availablePlaneSeats -= 2;

//impulse candybar purchase add 2.15 to the grocery total
		costOfGroceries += 2.15;
//birth certificate was printed incorrectly, change the middle initial to something else
		middleNameInitial = 'B';
//the season has changed update the hot outside variable to be opposite of what it is
		isHotOutside = true;
//can also say isHotOutside = !isHotOutside
		
//create a new variable called full name using the customers full name, middle initial and a last name of your choice
		String fullName = firstName + " " + middleNameInitial + " Montana";
//print a line to the console that introduces the customer and says they live at the address variable
	System.out.println("Hi my name is " + fullName + " I live at " + streetAddress);
				
	}

}
