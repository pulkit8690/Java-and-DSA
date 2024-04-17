/*  INPUTS IN JAVA
 next,
 nextline,
 nextInt,
 nextByte,
 nextFloat,
 nextDouble,
 nextBoolean,
 nextShort,
 nextLong
            import java.utils
            Import Scanner Class 
                Scanner sc=new Scanner(System.in)
 */
import java.util.*;
public class five_input {
    public static void main(String[] args) {
        @SuppressWarnings("resource")      // Ignore this
        Scanner sc= new Scanner(System.in);  // Scanner is class; sc is object
        //Taking Integer as Input
        System.out.print("Enter Number: ");
        int number=sc.nextInt();
        System.out.println(number);

        //Taking String without Space as input
        String input=sc.next();
        System.out.println(input);

        //Taking String with Space as input
        String name=sc.nextLine();
        System.out.println(name);

        //Taking Float as input
        float f=sc.nextFloat();
        System.out.println(f);

        //Taking boolean as input
        boolean h=sc.nextBoolean();
        System.out.println(h);
    }
}
