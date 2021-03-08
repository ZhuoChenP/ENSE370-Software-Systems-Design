/* I use the MVC deisgn pattern which includes classes: ReservationController, ReservationModel, ReservationView to separate the functionalities.
I use the Decorator design pattern which includes classes: Ticket, ExcessBaggage, ExtraLegroom, In_flightMeals, DecoratorTicket, ConcreteFlight to eaily add any or
all options to the flight ticket
Finally, I use the Iterator design pattern which includes classes: FlightIteratir, Iterator, Flight_Db, AccessDb, and one private class inside FlightDb which is 
FlightItDBIerator to be able to iterate through the database.

*/

import java.util.Scanner;

public class A02chen222z {
	public static void main (String[] args)
	{
		ReservationModel model=new ReservationModel();
		ReservationView view=new ReservationView();
		 ReservationController controller=new ReservationController(model,view);
		controller.addFlightDb("Regina", "Vancouver", 900, 300);
		controller.addFlightDb("Regina", "Vancouver", 1500, 350);
		controller.addFlightDb("Regina", "Toronto", 1300, 500);

		System.out.println("Enter Departure City :");
		Scanner de = new Scanner (System.in);
		String departure=de.nextLine();
		System.out.println("Enter Arrival City :");
		Scanner ar = new Scanner (System.in);
		String arrival=ar.nextLine();
		controller.showTheFlights(departure, arrival);

		System.out.println("Which flight do you want?");
		Scanner num = new Scanner (System.in);
		int number=num.nextInt();
		controller.selectFlight(number);
		System.out.println("Do you want to add extra legroom seats (Y/N)?");
		Scanner el_s = new Scanner (System.in);
		String els=el_s.nextLine();
		System.out.println("Do you want to add in-flight meals (Y/N)?");
		Scanner if_m = new Scanner (System.in);
		String ifm=if_m.nextLine();
		System.out.println("Do you want to add excess baggage (Y/N)?");
		Scanner e_b= new Scanner (System.in);
		String eb=e_b.nextLine();

		controller.showTicketInfo(els,eb,ifm);
	}
}
