import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.print("Area of Circle is: ");
        System.out.print(area);
    }
}
