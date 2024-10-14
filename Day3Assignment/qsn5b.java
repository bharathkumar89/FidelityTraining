class AreaCalculator {

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double squareArea = calculator.calculateArea(5.0);
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        double circleArea = calculator.calculateArea(3.0);

        System.out.println("Area of square (side 5.0): " + squareArea);
        System.out.println("Area of rectangle (4.0 by 6.0): " + rectangleArea);
        System.out.println("Area of circle (radius 3.0): " + circleArea);
    }
}
