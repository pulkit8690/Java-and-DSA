package StaticExample;

public class example {

    //*************************** QUES 1 **************************/
    /*
    String name;
    example(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
        example e1 = new example("Pulkit");
        example e2 = new example("Rahul");
        System.out.println(e1.name); //Pulkit
        System.out.println(e2.name); //Rahul
    }
    */


    //*************************** QUES 2 **************************/
    /*
    static String name;
    example(String name)
    {
        example.name=name;
    }
    public static void main(String[] args) {
        example e1 = new example("Pulkit");
        example e2 = new example("Rahul");
        System.out.println(e1.name); //Rahul
        System.out.println(e2.name); //Rahul

        // Both Have Output rahul because name is declared static
    }
    */

    //*************************** QUES 3 **************************/
    /*
    public class Inner{
        String name;
        Inner(String name)
        {
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Inner e1 = new Inner("Pulkit");
        Inner e2 = new Inner("Rahul");
        System.out.println(e1.name); // Error Because inner class is not static
        System.out.println(e2.name); // Error Because inner class is not static
    }
    */
}
