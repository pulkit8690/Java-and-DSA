//package Arrays;


  /* ****** Creating an Array ********
       1. datatype arrayName[]=new datatype[size];
       2. length of array=arr.length()
    
    
         */

public class creatingArray {
    public static void main(String[] args) {
        int marks[]=new int[50];
        int num[]={1,2,3};
        String name[]={"Pulkit","Nimrat","Geet","Sehaj"};
        char arr[]={'a','b','c'};
        float arr1[]={2.4f,3.5f};
        System.out.println("Length of name array is: "+ name.length);
        System.out.println(marks);
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(num);
        
    }
    
}
