
public class ExcessBaggage extends DecoratorTicket {

	public ExcessBaggage(Ticket newTicket) {
		super(newTicket);
	}
	public int getPrice() {
		return ticket.getPrice()+20;
	}
}
