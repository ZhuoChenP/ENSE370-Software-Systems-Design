import java.util.ArrayList;

public class AccessDb {
	private Flight_DB iterFlightDb;
	
	public AccessDb(Flight_DB newFlight)
	{
		iterFlightDb=newFlight;
	}
	public ArrayList<Flight> findTheFlight(String d, String a) {
		Iterator FlightMatch=iterFlightDb.createIterator();
		return matchTheFlight(FlightMatch,d,a);
	}
	public ArrayList<Flight> matchTheFlight(Iterator iterator,String d, String a)
	{
		ArrayList<Flight> result=new ArrayList<Flight>();
		while(iterator.hasNext())
		{
			Flight flight=(Flight) iterator.next();
			if(flight.getDcity().equals(d)&&flight.getAcity().equals(a))
			{
				result.add(flight);
			}
		}
		return result;
	}
}
