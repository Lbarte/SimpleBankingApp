package simpleBankingApplication;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		System.out.println("Hello and welcome to..");
		System.out.println("Simple Banking Application\n");
		
		System.out.println("Your current amount of $ is:");
		System.out.println("_____________________________________________");
		
		int current = 0;
		System.out.println(current);
		System.out.println();
		
		System.out.println("#############################################");
		System.out.println("_____________________________________________");
		System.out.println("Menu:");

		System.out.println("_____________________________________________");
		System.out.println("");
		System.out.println("--Add");

		System.out.println("_____________________________________________");
		System.out.println("");
		System.out.println("--Withdraw");
		
		System.out.println("_____________________________________________");
		System.out.println("");
		System.out.println("--Exit");
		
		System.out.println("#############################################");
		
		System.out.println("Choose from Menu");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		System.out.println("Your choice is --- "+s);
		
		switch(s) {
			case "Exit":
				System.out.println("Program exited");
				break;
			case "Add":
				System.out.println("How much?");
				String added = scanner.next();
				current += Integer.parseInt(added);
				System.out.println("current is "+current);
				break;
			case "Withdraw":
				System.out.println("How much?");
				String minus = scanner.next();
				current -= Integer.parseInt(minus);
				System.out.println("current is "+current);
				break;
		}
		scanner.close();
	}
}
