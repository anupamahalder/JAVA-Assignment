// 1. Write a program to accept two short integers from user and display the sum. 
import java.util.*;
public class prob1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a short value: ");
        short num1 = sc.nextShort();
        System.out.println("Enter another short value: ");
        short num2 = sc.nextShort();
        System.out.println("The sum of two numbers is: "+(num1+num2));
        sc.close();
    }
}