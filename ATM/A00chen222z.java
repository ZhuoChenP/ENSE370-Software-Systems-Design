import java.util.Scanner;
public class A00chen222z {
	public static void main (String[] args) {
		System.out.println("Enter the amount betwen 0 to 10,000:");
		Scanner amount_entered = new Scanner (System.in);
		int amount=amount_entered.nextInt();
		ATM frist_atm=new ATM();
		ATM second_atm=new ATM(amount,true);
		Operator operator=new Operator();
		System.out.println("Enter your name for the Operator:");
		Scanner name_entered = new Scanner (System.in);
		String name=name_entered.nextLine();
		operator.setName(name);
		System.out.println("Processing ATM 1.");
		operator.topUpATM(frist_atm);
		System.out.println("Processing ATM 2.");
		operator.topUpATM(second_atm);
		Customer customer=new Customer();
		System.out.println("Enter your name for the Customer:");
		Scanner cname_entered = new Scanner (System.in);
		String cname=name_entered.nextLine();
		customer.setName(cname);
		System.out.println("Enter the amount of money to withdraw:");
		Scanner camount_entered = new Scanner (System.in);
		int camount=amount_entered.nextInt();
		camount_entered.close();
		customer.withdrawCash(second_atm, camount);
	}
}
