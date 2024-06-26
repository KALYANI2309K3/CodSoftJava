import java.util.Scanner;

public class ATM_Machine {
   public ATM_Machine() {
   }

   public static void main(String[] args) {
      int balance = 0;
      Scanner sc = new Scanner(System.in);

      while(true) {
         while(true) {
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");
            int choice = sc.nextInt();
            switch (choice) {
               case 1:
                  System.out.print("Enter money to be withdrawn:");
                  int withdraw = sc.nextInt();
                  if (balance >= withdraw) {
                     balance -= withdraw;
                     System.out.println("Please collect your money");
                  } else {
                     System.out.println("Insufficient Balance");
                  }

                  System.out.println("");
                  break;
               case 2:
                  System.out.print("Enter money to be deposited:");
                  int deposit = sc.nextInt();
                  balance += deposit;
                  System.out.println("Your Money has been successfully depsited");
                  System.out.println("");
                  break;
               case 3:
                  System.out.println("Balance : " + balance);
                  System.out.println("");
                  break;
               case 4:
                  System.exit(0);
            }
         }
      }
   }
}
