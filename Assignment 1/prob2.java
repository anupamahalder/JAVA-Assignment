// 2. Write a program that accepts number of command line parameters and displays the parameters and 
public class prob2{
    public static void main(String []args){
        int len = args.length;
        System.out.println("The length of the parameters: "+len);
        System.out.println("The parameters are: ");
        for(int i=0;i<len;i++){
            System.out.println("The parameter "+(i+1)+" is: "+args[i]);
        }
    }
}
