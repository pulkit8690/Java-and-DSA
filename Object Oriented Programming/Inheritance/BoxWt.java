package Inheritance;



public class  BoxWt extends Box{
    double weight;
    BoxWt()
    {
        super();
        this.weight=-1;
    }
    BoxWt(double l, double w, double h, double wt)
    {
        super(l,w,h); // Super will call the Parent Constructor Use to initialize values present in Parent class
        this.weight=wt;
    }
    public static void main(String[] args) {
        BoxWt b4= new BoxWt();
        System.out.println(b4.length+" "+b4.width+" "+b4.height+" "+b4.weight+" ");
        BoxWt b5= new BoxWt(87,54,90,100);
        System.out.println(b5.length+" "+b5.width+" "+b5.height+" "+b5.weight+" ");


        //Box b8 = new BoxWt(87, 32, 32, 12); // It will work 
        //BoxWt b6 = new Box(5,7,9); // ERROr
        
    }
}