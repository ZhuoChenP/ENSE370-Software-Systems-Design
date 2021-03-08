
public class ConcreteFlight implements Ticket {
	
	private Flight flight;
	private String extra_Legroom;
	private String in_flight_meal;
	private String excess_Baggage;
	public ConcreteFlight(Flight f,String els, String eb,String ifm) {
		flight=f;
		extra_Legroom=els;
		in_flight_meal=ifm;
		excess_Baggage=eb;
	}
	@Override
	public String getDcity() {
		return flight.getDcity();
	}

	@Override
	public String getAcity() {
		return flight.getAcity();
	}

	@Override
	public int getDtime() {
		return flight.getDtime();
	}

	@Override
	public int getPrice() {
		return flight.getPrice();
	}
	public String getExtra_Legroom(){
		return extra_Legroom;
	}
	public String getIn_flight_meal(){
		return in_flight_meal;
	}
	public String getExcess_Baggage(){
		return excess_Baggage;
	}
}
