import java.util.*;
public class prob5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = str1;
        System.out.println("Two string comparison by '==' operator is: "+(str1==str2));
        System.out.println("Two string comparison by 'equals()' is: "+(str1.equals(str2)));
        System.out.println("Enter a string: ");
        str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        str2 = sc.nextLine();
        System.out.println("Two string comparison by '==' operator is: "+(str1==str2));
        System.out.println("Two string comparison by 'equals()' is: "+(str1.equals(str2)));
        sc.close();
    }
}