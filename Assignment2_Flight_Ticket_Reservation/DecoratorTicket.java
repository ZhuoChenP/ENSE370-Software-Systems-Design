
abstract class DecoratorTicket implements Ticket {
	protected Ticket ticket;

	public DecoratorTicket(Ticket newTicket) {
		ticket=newTicket;
	}
	public String getDcity() {
		return ticket.getDcity();
	}
	public String getAcity() {
		return ticket.getAcity();
	}
	public int getDtime() {
		return ticket.getDtime();
	}
	public int getPrice() {
		return ticket.getPrice();
	}
	public String getExtra_Legroom(){
		return ticket.getExtra_Legroom();
	}
	public String getIn_flight_meal(){
		return ticket.getIn_flight_meal();
	}
	public String getExcess_Baggage(){
		return ticket.getExcess_Baggage();
	}
}
