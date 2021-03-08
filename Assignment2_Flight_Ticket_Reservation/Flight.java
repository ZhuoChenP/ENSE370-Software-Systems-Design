
public class Flight {
	public String departureCity;
	public  String arrivalCity;
	public int departureTime;
	public int price;

	public Flight(String Dcity,String Acity, int Dtime, int price)
	{
		departureCity=Dcity;
		arrivalCity=Acity;
		departureTime=Dtime;
		this.price=price;
	}	
	public  String getDcity() {
		return departureCity;
	}
	public  String getAcity() {
		return arrivalCity;
	}
	public  int getDtime() {
		return departureTime;
	}
	public  int getPrice() {
		return price;
	}
}