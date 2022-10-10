package day11_12;

import java.util.Scanner;

class Account {
	Scanner scanner = new Scanner(System.in);

     void debit(int accBalance){
        System.out.println("Account Balance is : " + accBalance);
        System.out.println("Enter amount to debit : ");
        int debitamount = scanner.nextInt();
        int balanceamount = accBalance - debitamount;

        if( debitamount <= accBalance) {
            System.out.println("Money " + debitamount + " is Debited from your Account ");
            System.out.println("Your BALANCE is "+balanceamount);
        }
        else{
            System.out.println("You tried to Debit amount " + debitamount + " which exceeded your account balance " + accBalance);
            System.out.println("Your BALANCE is "+accBalance);
        }
        System.out.println("Thanks for the transaction");
    }

}

public class AccountTest {
	 public static void main(String[] args) {
         Account account = new Account();
         System.out.println("Enter the amount");
         Scanner sc = new Scanner(System.in);
         int accBalance = sc.nextInt();

         account.debit(accBalance);

         System.out.println("Transaction Completed");
         sc.close();

         } 

}
