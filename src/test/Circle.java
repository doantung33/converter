package test;

public class Circle {
    double radius = 1;
    String color= " red";

    Circle(){

    }
    Circle(double radius){
        this.radius= radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius * radius* Math.PI;
    }

}
class TestCricle {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }

}
