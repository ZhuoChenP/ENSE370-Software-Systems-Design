import java.util.ArrayList;

public class Flight_DB implements FlightIterator{
	private ArrayList<Flight> flightList;
	
	public Flight_DB() {
		flightList=new ArrayList<Flight>();
	}
	public void addFlight(String Dc,String Da,int Dt, int P)
	{
		Flight flight=new Flight(Dc,Da,Dt,P);
		flightList.add(flight);
	}
	public FlightItDBIerator createIterator() {
		return new FlightItDBIerator();
	}
	private class FlightItDBIerator implements Iterator{
		private int index;

		@Override
		public boolean hasNext() {
			if(index < flightList.size()){
				return true;
			 }
			 return false;
		}
	
		@Override
		public Object next() {
			if(this.hasNext()){
				return flightList.get(index++);
			 }
			 return null;
		  }	
	}
}
