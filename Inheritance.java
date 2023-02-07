class Shape{
    int heignt=20,width=20;
}

public class Inheritance extends Shape {
    public static void main(String[] args) {
        Shape s=new Shape();
        System.out.println("The are is " + s.heignt*s.width);

    }
}
