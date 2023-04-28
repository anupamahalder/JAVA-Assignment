import java.util.*;
public class prob4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double r=sc.nextDouble();
        final double PI = 3.14;
        System.out.println("The area of the circle is: "+(PI*r*r));
        sc.close();
    }
}
