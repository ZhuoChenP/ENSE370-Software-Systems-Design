import java.util.ArrayList;

public class ReservationModel {
	private Flight_DB flightDb;
	private AccessDb accessDb;
	private Flight result;
	private ArrayList<Flight> matchedFlights;
	private Ticket finalTicket;
	private int selectedFlight_num;
	
	
	public ReservationModel() {
		flightDb=new Flight_DB();
		accessDb=new AccessDb(flightDb);
	}
	
	public void addFlightIntoDb(String Dc,String Da,int Dt, int P)
	{
		flightDb.addFlight(Dc, Da, Dt, P);
	}
	public ArrayList<Flight> getFlights(String Dc,String Da)
	{
		matchedFlights=accessDb.findTheFlight(Dc,Da);
		return matchedFlights;
	}
	public void setResult(){
		result=new Flight(matchedFlights.get(selectedFlight_num-1).getDcity(),matchedFlights.get(selectedFlight_num-1).getAcity(),matchedFlights.get(selectedFlight_num-1).getDtime(),matchedFlights.get(selectedFlight_num-1).price);
	}
	public void setFlight_num(int flight){
		selectedFlight_num=flight;
	}
	public Ticket getTicketInfo(String els, String eb,String ifm){
		finalTicket=new ConcreteFlight(result,els,eb,ifm);
		
		if(ifm.equals("Y"))
			finalTicket=new In_flightMeals(finalTicket);
		if(els.equals("Y"))
			finalTicket=new ExtraLegroomSeats(finalTicket);
		if(eb.equals("Y"))
			finalTicket=new ExcessBaggage(finalTicket);
		return finalTicket;
	}
}
