package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your AccountNumber");
        String accNo=sc.nextLine();

        System.out.println("Enter initial  Password");
        String pass=sc.nextLine();

        System.out.println("Enter initial amount to add into account ");
        int money=sc.nextInt();

        System.out.println("Which account you want to chose LotakBank or NoBank");
        String accountName=sc.next();
        RBI bankAccount;
        if(accountName.equals("LotakBank")){
            bankAccount =new LotakBank(accNo,money,pass);
        }
        else{
            bankAccount=new NoBank(accNo,money,pass);
        }

        System.out.println("Enter your choice");
        System.out.println("1. Check balance");
        System.out.println("2. add money");
        System.out.println("3. withdraw money");
        System.out.println("4. Interest After years");

        int ch=sc.nextInt();
        switch(ch){

            case 1 : System.out.println("Available balance is " + bankAccount.checkBalance(pass));
                     break;
            case 2 :  System.out.println("Enter Password");
                      String passw=sc.nextLine();
                      System.out.println("Amount to add");
                      int m=sc.nextInt();
                      System.out.println(bankAccount.addMoney(passw ,m));
                      break;
            case 3 : System.out.println(bankAccount.withdraw(sc.nextLine(),sc.nextInt()));
                      break;
            case 4 : System.out.println(bankAccount.calculateInterest(sc.nextInt()));
                     break;

            default: System.out.println("Enter a valid choice");
        }

    }
}