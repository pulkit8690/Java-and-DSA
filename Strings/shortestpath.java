import java.util.*;

public class shortestpath {
    public static void shortestPath(String str, float x1, float y1) {
        float x2 = x1;
        float y2 = y1;
        boolean isValidPath = true; 
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'N' || str.charAt(i) == 'n')
            {
                y2 = y2 + 1;
            } 
            else if (str.charAt(i) == 'S' || str.charAt(i) == 's')
            {
                y2 = y2 - 1;
            } 
            else if (str.charAt(i) == 'E' || str.charAt(i) == 'e') 
            {
                x2 = x2 + 1;
            } 
            else if (str.charAt(i) == 'W' || str.charAt(i) == 'w') 
            {
                x2 = x2 - 1;
            } 
            else 
            {
                System.out.println("Invalid Path Directions");
                isValidPath = false; 
                break;
            }
        }
        if (isValidPath)
         { 
            float X = (x2 - x1) * (x2 - x1);
            float Y = (y2 - y1) * (y2 - y1);
            double dis = Math.sqrt(X + Y);
            System.out.println("Shortest Distance is: " + dis);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        System.out.print("Enter Path in Terms of N S W E: ");
        String str1 = sc.nextLine();
        System.out.println("Enter Initial Point X and Y");
        System.out.print("Enter X: ");
        x = sc.nextFloat();
        System.out.print("Enter Y: ");
        y = sc.nextFloat();
        shortestPath(str1, x, y);
    }
}
