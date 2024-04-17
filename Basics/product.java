import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int prod=a*b;
        System.out.println(prod);
    }
}
