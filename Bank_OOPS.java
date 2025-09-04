/*
1.Problem Statement: Banking System Simulation
You are tasked with implementing a basic banking system. In this system, a user can interact with a bank account by performing operations like displaying account details, depositing money, withdrawing money, and displaying the current balance.

Requirements:
Account Information:
Each bank account has three instance variables:
int act: Account number (unique identifier).
String name: Account holder's name.
int bal: Current balance of the account.
  
You are required to initialize these instance variables using a constructor during the creation of the Bank object.
Operations: The user will interact with the bank account by performing the following operations:
display: Display the current balance of the account.
deposit <amount>: Deposit the specified amount into the account.
withdraw <amount>: Withdraw the specified amount from the account. If the withdrawal amount exceeds the balance, print "Insufficient Balance".
  
INPUT:
12345 John 5000
4
deposit 1000
withdraw 3000
display
withdraw 5000
  
Output:
Name: John
Account Number: 12345 
Balance: 3000 
Insuffcient Balance
*/

import java.util.*;

class Bank{
    int act,bal;
    String name;
    
    Bank(int act,String name, int bal)
    {
        this.act=act;
        this.name=name;
        this.bal=bal;
    }
    
    void display()
    {
        System.out.println("Your balance is: " + bal);
    }
    
    void print()
    {
        System.out.println("Account Number: " + act);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
    void deposit(int amt)
    {
        bal+=amt;
    }
    
    void withdraw(int amt)
    {
        if(amt>bal)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            bal -= amt;
        }
    }
}

public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int act = s.nextInt();
        String name = s.next();
        int bal = s.nextInt();
        
        Bank b = new Bank(act,name,bal);
        b.print();
        
        int op = s.nextInt();
        for(int i=0;i<=op;i++)
        {
            String choice=s.next();
            
            if(choice.equals("display"))
            {
                b.display();
            }
            else if(choice.equals("deposit"))
            {
                int amt=s.nextInt();
                b.deposit(amt);
                System.out.println("Amount deposited successfully");
            }
            else if(choice.equals("withdraw"))
            {
                int amt=s.nextInt();
                b.withdraw(amt);
            }
            else
            {
                System.out.println("Enter a valid input");
            }
        }
    }
}
