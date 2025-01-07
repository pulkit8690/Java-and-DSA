package Inheritance;

public class BoxPrice extends BoxWt{
    double price;
    BoxPrice()
    {
        super();
        this.price=-1;
    }
    BoxPrice(BoxPrice other)
    {
        

    }
    public static void main(String[] args) {
        BoxPrice bp=new BoxPrice();
        System.out.println(bp.price);
    }
}
