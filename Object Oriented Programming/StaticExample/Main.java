package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(22, "Pulkit", 5000, false);
        System.out.println(h1.name);
        System.out.println(Human.population);
        Human h2 = new Human(22, "Rahul", 5000, false);
        System.out.println(h2.name);
        System.out.println(Human.population);
    }
}
