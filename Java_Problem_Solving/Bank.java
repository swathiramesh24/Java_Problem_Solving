//package Java_Problem_Solving;
import java.util.*;
class BankDetails {
  int act;
  String name;
  int bal;

  BankDetails(int act, String name,int bal)
  {
    this.act=act;
    this.name=name;
    this.bal=bal;
  }

  void display()
  {
    System.out.println(bal);
  }

  void deposit(int amt)
  {
    bal += amt;
    System.out.println(amt + " deposited successfully");
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
      System.out.println(amt + " withdrawn successfully");
    }
  }

  void print()
  {
    System.out.println("Name: " + name);
    System.out.println("Account Number: " + act);
  }
}

public class Bank{
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Give act num, name and balance:");
      int act=s.nextInt();
      String name = s.next();
      int bal=s.nextInt();

      BankDetails b = new BankDetails(act,name,bal);

      System.out.print("Enter total operation :");
      int n = s.nextInt();

      for(int i=0;i<n;i++)
      {
        System.out.print("Enter you choice(display,deposit,withdraw):");
        String choice = s.next();

        if(choice.equals("display"))
        {
          b.display();
        }

        else if(choice.equals("deposit"))
        {
          System.out.print("Enter amount to deposit:");
          int amt = s.nextInt();
          b.deposit(amt);
        }

        else if(choice.equals("withdraw"))
        {
          System.out.print("Enter amount to withdraw:");
          int amt = s.nextInt();
          b.withdraw(amt);
        }

      }
    }
}
