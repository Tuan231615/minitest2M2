
public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid1 = new Trapezoid(10 , 20, 7, 4, 5);
        System.out.println(trapezoid1.toString());
        Trapezoid trapezoid2 = new Trapezoid(20, 30, 9, 10 ,15);
        System.out.println(trapezoid2.toString());
        if (trapezoid1.Area()< trapezoid2.Area()){
            System.out.println("Diện tích hình 1 nhỏ hơn 2");
        } else {
            System.out.println("Diện tích hình 1 lớn hơn diện tích hình 2");
        }
        if(trapezoid1.Perimeter() < trapezoid2.Perimeter()){
            System.out.println("Chu vi hình 1 nhỏ hơn chu vi hình 2");
        } else {
            System.out.println("Chu vi hình 1 lớn hơn chu vi hình 2");
        }
    }
}