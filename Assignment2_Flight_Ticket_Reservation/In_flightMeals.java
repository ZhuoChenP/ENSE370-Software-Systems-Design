
public class In_flightMeals extends DecoratorTicket {

	public In_flightMeals(Ticket newTicket) {
		super(newTicket);
	}
	public int getPrice() {
		return ticket.getPrice()+10;
	}
}
