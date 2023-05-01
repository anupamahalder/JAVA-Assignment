import java.util.*;
public class BankAcc{
    int acc_no;
    double balance;
    double interest=7.2;
    public static void main(String args[]){
        BankAcc b1=new BankAcc();
        b1.changeValues(101,5006.7);
        b1.changeValues(30000.5);
        b1.display();
    }
    BankAcc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter the balance: ");
        balance = sc.nextDouble();
        sc.close();
    }
    void changeValues(int acc,double bal){
        acc_no = acc;
        balance = bal;
    }
    void changeValues(int acc){
        acc_no = acc;
    }
    void changeValues(double bal){
        balance = bal;
    }
    void display(){
        System.out.println("\nThe account details --");
        System.out.println("The account number: "+acc_no);
        System.out.println("The Balance: "+balance);
        System.out.println("The rate of interest: "+interest+"%");
    }
}