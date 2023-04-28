import java.util.*;
public class prob3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in cm: ");
        int cm = sc.nextInt();
        int ft=0;
        double inches=0.0;
        inches = cm/2.54;
        ft = (int)inches/12;
        inches = inches%12;
        System.out.println("The height is "+ft+" ft and "+inches+" inches!");
        sc.close();
    }
}