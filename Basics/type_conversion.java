/*    *********  TYPE CONVERSION   **********
 1. Small Size data type's data can be stored in Larger Size data types but vice versa is not true
        eg: data of int can be storedin in long because int(4 bytes) and long(8 bytes) but vice versa is not true
            byte->short->int->float->long->double
                int x=9;
                long y=x; // will work fine

                But
                long x=9;
                int y=x; // will throw error

2. These type of conversion:    long x=9;                           are called lossy conversions
                                int y=x; // will throw error

3. These tye of conversion:     int x=9;                            are called implicit conversion/widening
                                long y=x; // will work fine
 */


 /* ************ TYPE CASTING *************
1. Explicitly conversion of data
    eg: float a= 8.998f;
        int b= (int)a;
2. Also called Narrowing/ EXPLICIT Conversion
  */

/* *********** TYPE PROMOTION **************
1. Java Automatically Promotes each byte,short,or char operand to int when evaluating the expression.
2. If One operand is long,float or double, the whole expression is promoted to long,float or double.
 */
import java.util.Scanner;

public class type_conversion {
    public static void main(String[] args) {
        System.out.println("**** TYPE CONVERSION ****");
        // type conversion
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        //int number = sc.nextFloat() // Error
        float number=sc.nextInt();    // No Error
        System.out.println(number);


        //type casting
        System.out.println("**** TYPE CASTING ****");
        float x=12.998f;
        int y=(int)x;
        System.out.println(y);

        System.out.println("**** TYPE PROMOTION ****");
        char a='a';
        char b='b';
        //char c=b-a;// ERROR
        int c= b-a;
        System.out.println(c);// output--> 1   (98-97)

        short d=10;
        byte e= 2;
        //char f= a+d+e;// error
        int f= a+d+e;
        System.out.println(f);
        sc.close();

    }
}
