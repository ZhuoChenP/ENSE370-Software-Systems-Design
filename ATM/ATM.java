
public class ATM {
	
	private int cash;
	private boolean inService;
	public ATM()
	{
		this.cash=0;
		this.inService=false;
	}
	public ATM(int x,boolean y)
	{
		this.cash=x;
		this.inService=y;	
	}
	public int queryCash()
	{
		return this.cash;
	}
	public void increaseCash(int x)
	{
		this.cash=this.cash+x;
	}
	public void reduceCash(int x) 
	{
		this.cash=this.cash-x;
	}
	public boolean getServiceStatus()
	{
		return this.inService;
	}
	public void changeServiceStatus() 
	{
		if(inService==false)
		{
			inService=true;
			System.out.println("inService is now is: "+ inService);
		}
		else if(inService==true)
		{
			inService=false;
			System.out.println("inService is now is: "+ inService);
		}
	}
	class CashDispenser
	{
		public void dispenseCash(int x)
		{
			reduceCash(x);
			System.out.println(x+" dollars has been dispensed.");
		}
	}
	class ReceiptPrinter
	{
		public void printReceipt()
		{
			System.out.println("Receipt has been printed.");
		}
	}
	class CardReader
	{
		public void readCard()
		{
			System.out.println("Card has been read.");
		}
	}
	class KeypadDisplay
	{
		public void displayPINverification ()
		{
			System.out.println("PIN has been verified.");
		}
	}
	
	public CashDispenser dispenser=new CashDispenser();
	public ReceiptPrinter printer=new ReceiptPrinter();
	public CardReader reader =new CardReader();
	public KeypadDisplay display=new KeypadDisplay();

}
