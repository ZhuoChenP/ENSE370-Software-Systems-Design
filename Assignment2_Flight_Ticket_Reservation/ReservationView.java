import java.util.ArrayList;

public class ReservationView {
    public void printMatchedFlights(ArrayList<Flight> flights)
    {	System.out.println("Flights found : ");
        for(int i = 0; i < flights.size(); i++) {   
        	int index=i+1;
            System.out.println(" ( "+index+" ) "+" "+flights.get(i).getDcity()+" "+flights.get(i).getAcity()+" "+flights.get(i).getDtime()+"H  $"+flights.get(i).getPrice());  
        }  
    }
    public void printFinalTicket(Ticket finalTicket){
        System.out.println("Your final flight information is : ");
        System.out.println("Departure City : "+finalTicket.getDcity());
        System.out.println("Arrival City : "+finalTicket.getAcity());
        System.out.println("Time : "+finalTicket.getDtime()+" H");
        System.out.println("Extra Legroom : "+finalTicket.getExtra_Legroom());
        System.out.println("In-flight meals : "+finalTicket.getIn_flight_meal());
        System.out.println("Excess Baggage is : "+finalTicket.getExcess_Baggage());
        System.out.println("Total Price  : $"+finalTicket.getPrice());
    }
}