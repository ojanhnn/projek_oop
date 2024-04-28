import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Box extends Shape {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
}

public class bangun_ruang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bentuk geometri:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Balok");
        System.out.println("6. Kerucut");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                System.out.println("Luas persegi: " + square.calculateArea());
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double rectangleLength = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double rectangleWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
                System.out.println("Luas persegi panjang: " + rectangle.calculateArea());
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("Luas lingkaran: " + circle.calculateArea());
                break;
            case 4:
                System.out.print("Masukkan alas segitiga: ");
                double triangleBase = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleBase, triangleHeight);
                System.out.println("Luas segitiga: " + triangle.calculateArea());
                break;
            case 5:
                System.out.print("Masukkan panjang balok: ");
                double boxLength = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double boxWidth = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double boxHeight = scanner.nextDouble();
                Box box = new Box(boxLength, boxWidth, boxHeight);
                System.out.println("Luas balok: " + box.calculateArea());
                break;
            case 6:
                System.out.print("Masukkan jari-jari kerucut: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                double coneHeight = scanner.nextDouble();
                Cone cone = new Cone(coneRadius, coneHeight);
                System.out.println("Luas kerucut: " + cone.calculateArea());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

