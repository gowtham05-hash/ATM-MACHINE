import java.lang.Thread;
import java.util.Scanner;
public class ATM_project {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your card !!");
		System.out.println("Please wait!!..");
		Thread.sleep(10000);
		int password = 6380;
		System.out.print("Enter your pin: ");
		int pin = input.nextInt();
		int balance = 50000;
		if(pin==password) {
			System.out.println(" 1.BALANCE\n 2.WITHDRAW BALANCE\n 3.DEPOSIT BALANCE\n 4.EXIT ");
		}
		else {
			System.out.println("Please enter your valid password");
		}
		System.out.print("Click your option: ");
		int option = input.nextInt();
		if(option==1) {
			System.out.print("Your Balance is: "+balance);
			System.out.println("\nPlease remove your card!");
			System.out.println("Have a nice day for you!!!");
			System.out.println("=========================");
		}
		if(option==2) {
			System.out.print("Please enter your withdraw amount: ");
			int amount = input.nextInt();
			balance = balance-amount;
			System.out.print("Your current balance is: "+balance);
			System.out.println("\nPlease remove your card!");
			System.out.println("Hava a nice day for you!!");
			System.out.println("=========================");
		}
		if(option==3) {
			System.out.println("Please enter your Deposit amount: ");
			int deposit = input.nextInt();
			balance = balance+deposit;
			System.out.print("Your current balance is: "+balance);
			System.out.println("\nPlease remove your card!!");
			System.out.println("Hava a nice day for you!!");
			System.out.println("=========================");
		}
		if(option==4) {
			System.out.println("Exit");
			System.out.println("Hava a nice day for you!!..");
			System.out.println("=========================");
		}
	}

}