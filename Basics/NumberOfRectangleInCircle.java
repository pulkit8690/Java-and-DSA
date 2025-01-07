//https://www.geeksforgeeks.org/problems/rectangles-in-a-circle0457/0

public class NumberOfRectangleInCircle {
    public static int fun(int r)
    {
        int count=0;
        int max=2*r;
        for(int a=1;a<max;a++)
        {
            for(int b=1;b<max;b++)
            {
                if((a*a + b*b)<=4*r*r)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int r=2;
        System.out.println(fun(r));
        r=1;
        System.out.println(fun(r));
        r=3;
        System.out.println(fun(r));
    }
}
