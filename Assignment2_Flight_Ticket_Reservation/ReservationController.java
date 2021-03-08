
public class ReservationController {
    private ReservationModel model;
    private ReservationView view;
    public ReservationController(ReservationModel m,ReservationView v)
    {
        model=m;
        view=v;
    }
    public void addFlightDb(String Dc,String Da,int Dt, int P){
        model.addFlightIntoDb(Dc, Da, Dt, P);
    }
    public void showTheFlights(String Dc,String Da)
    {
        view.printMatchedFlights(model.getFlights(Dc, Da));
    }
    public void selectFlight(int num){
        model.setFlight_num(num);
        model.setResult();
    }
    public void showTicketInfo(String els,String eb,String ifm)
    {
        view.printFinalTicket(model.getTicketInfo(els, eb, ifm));
    }
}
