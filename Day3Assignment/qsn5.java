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

        System.out.println("Area of square: " + calculator.calculateArea(4));
        System.out.println("Area of rectangle: " + calculator.calculateArea(5, 10));
        System.out.println("Area of circle: " + calculator.calculateArea(7));
    }
}
