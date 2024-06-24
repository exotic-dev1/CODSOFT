import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        
        Map<String, String> userCredentials = new HashMap<>();
        userCredentials.put("user1", "2024");
        userCredentials.put("user2", "2025");

        Map<String, Integer> userBalances = new HashMap<>();
        userBalances.put("user1", 1000);
        userBalances.put("user2", 500);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        
        if (!userCredentials.containsKey(username) || !userCredentials.get(username).equals(pin)) {
            System.out.println("Invalid username or PIN.");
            return;
        }
        balance = userBalances.get(username);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("1 for Withdraw");
            System.out.println("2 for Deposit");
            System.out.println("3 for Check Balance");
            System.out.println("4 for Exxit");
            System.out.print("Select the operation you want to perform: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    deposit = sc.nextInt();

                    balance += deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;
                    
                case 4:
                    userBalances.put(username, balance);
                    System.exit(0);
            }
        }
    }
}
Important Detalis :-
  1. Sample usernames - "user1" and "user2"
  2. Pins - user1= 2024, user2= 2025
  Thankyou
