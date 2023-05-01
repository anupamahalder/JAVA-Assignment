import java.util.*;
public class prob6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int num = sc.nextInt();
        show(num);
        System.out.println("Enter a short typed value: ");
        short sh= sc.nextShort();
        show(sh);
        System.out.println("Enter a double typed value: ");
        double dl = sc.nextDouble();
        show((int)dl);
        show(dl);
        sc.close();
    }
    public static void show(int x){
        System.out.println("The value is: "+x);
    }
    public static void show(double x){
        System.out.println("The value is: "+x);
    }
}