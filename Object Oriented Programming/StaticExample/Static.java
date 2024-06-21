/*

 1. Static Means u can use the method/variable without creating object of that class
        In Main.java we can directly print Human.population without creating its object
        public static void main(String[] args) 
        {
        System.out.println(Human.population);
        System.out.println(Human.population);
        }

 2. Both Variable and Function can be made static
    Best Example of Static Function is our main function
        public static void main(String args[])


 3. Something Which is not Static Belongs to an Object
        

 4. Static Variables/Function Not depend on Objects while NON-STATIC does depend on object

 5. Can't use non static function inside a static function


 */


package StaticExample;

public class Static 
{
    public static void main(String[] args) {
        //greeting(); // will throw error as greeting is non static 
    }
    void greeting()
    {
        System.out.println("Hi");
    }
    static void fun()
    {
        //greeting(); // will throw error as greeting is non static 
    }
}
