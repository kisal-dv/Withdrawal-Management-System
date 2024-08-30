import java.util.Scanner;

class WithdrawalManagementSystem {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Current balance :");
		double balance = scanner.nextDouble();

		System.out.print("Withdrawal :");
		double Withdrawal=scanner.nextDouble();

		double dailylimit=20000.00;

		String withraw =(Withdrawal>balance)?"Insufficient funds":(Withdrawal>dailylimit)? "The requested amount exceeds the daily withdrawal limit of 20 000 rupees":"Transaction successful: A withdrawal of " +Withdrawal+ " rupees has been made.";
		System.out.println(withraw);	

		double newbalance=balance-Withdrawal;

		String charge=newbalance>5000?"No charges applied. New balance:"+ newbalance +" rupees.":"A charge of 2% has been applied as the remaining balance is below 5000 rupees.Total charge:" +newbalance*0.02+" rupees.";
		System.out.println(charge);
	}}

	

