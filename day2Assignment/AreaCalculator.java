package com.Assignment2;

public class AreaCalculator {

    public int calculateArea(int side){
        return side*side;
    }

    public double calculateArea(double length, double breadth){
        return length*breadth;
    }

    public double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("The area of square is : "+ calc.calculateArea(5));
        System.out.println("The area of Rectangle is : "+ calc.calculateArea(4.0,6.0));
        System.out.printf("The area of square is : %.3f",calc.calculateArea(3.0));
    }
}
