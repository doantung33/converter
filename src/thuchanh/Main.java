package thuchanh;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(3);
        circle.setFilled("blue");
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getDiameter());
        System.out.println(circle.getPerimeter());
    }
}
