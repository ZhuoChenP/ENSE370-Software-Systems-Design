
public class ExtraLegroomSeats extends DecoratorTicket {

	public ExtraLegroomSeats(Ticket newTicket) {
		super(newTicket);
	}
	public int getPrice() {
		return ticket.getPrice()+5;
	}
}
