package Inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public static void getInfo() {
        System.out.println("Running Box Class");
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.length + " " + b1.width + " " + b1.height + " ");
        Box b2 = new Box(4.2);
        System.out.println(b2.length + " " + b2.width + " " + b2.height + " ");
        Box b3 = new Box(9, 4, 6);
        System.out.println(b3.length + " " + b3.width + " " + b3.height + " ");
    }
}
