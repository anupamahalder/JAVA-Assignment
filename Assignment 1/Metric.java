import java.util.*;
public class Metric{
    public static void main(String args[]){
        int choice=1;
        Scanner sc = new Scanner(System.in);
        while(choice != 3){
            System.out.println("Enter 1 for Kilometer to Mile conversion");
            System.out.println("Enter 2 for Mile to Kilometer conversion");
            System.out.println("Enter 3 for exit\nEnter your choice--");
            choice = sc.nextInt();
            switch(choice){
                case 1: kilo_to_mile(sc);
                        break;
                case 2: mile_to_kilo(sc);
                        break;
                case 3: System.exit(0);
                default:
                        System.out.println("You have entered invalid choice!");
            }
        }
        sc.close();
    }
    static void kilo_to_mile(Scanner sc){
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilometer: ");
        double kilom = sc.nextDouble();
        System.out.println("The given distance in mile is: " + (kilom / 1.5));
        
    }
    static void mile_to_kilo(Scanner sc){
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in mile: ");
        double mile = sc.nextDouble();
        System.out.println("The given distance in kilometer is: " + (mile*1.5));
        
    }
}