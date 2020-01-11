package com.company;
import java.util.Scanner;

public class areaFormulas {
    public void areaCircle(double radius){
        double area;
        area= (float) (Math.PI * radius * radius);
        System.out.println("Area of the circle is " + area);
    }
    public void areaSquare(int side){
        int area= side*side;
        System.out.println( "area of a square is " + area);
    }
    public void areaRectangle(int length, int breadth){
        int area= length*breadth;
        System.out.println("area of a rectangle is " + area);
    }
    public void areaTriangle(int base, int height){
        double area= 0.5 * base * height;
        System.out.println("area of a triangle is " + area);
    }
}

class areaOfShapes {
    public static void main(String[] args) {
        areaFormulas area = new areaFormulas();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        area.areaCircle(radius);

        System.out.print("Enter length of rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = input.nextInt();
        area.areaRectangle(length,breadth);

        System.out.print("Enter side of square: ");
        int side = input.nextInt();
        area.areaSquare(side);

        System.out.print("Enter height of triangle: ");
        int height = input.nextInt();
        System.out.print("Enter base of triangle: ");
        int base = input.nextInt();
        area.areaTriangle(height, base);
    }
}