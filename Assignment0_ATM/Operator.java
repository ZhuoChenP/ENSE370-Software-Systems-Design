
public class Operator extends Person {
	public void topUpATM(ATM atm)
	{
		System.out.println("The current inService status of the ATM:" + atm.getServiceStatus());
		System.out.println("The current cash amount of the ATM:" + atm.queryCash());
		if(atm.getServiceStatus()==true)
			atm.changeServiceStatus();
		if(atm.queryCash()<5000)
		{
			atm.increaseCash(5000);
		}
		System.out.println("ATM now has:" + atm.queryCash()+" dollars");
		if(atm.getServiceStatus()==false)
			atm.changeServiceStatus();
	}

}
