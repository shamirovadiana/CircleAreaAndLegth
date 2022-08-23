import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle :");
        double radius = scanner.nextDouble();
        double area = circleArea(radius);
        double length = circleLength(radius);
        System.out.println("Area : " + area);
        System.out.println("Length : " + length);

    }

    static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    static  double circleLength(double radius){
        return 2 * Math.PI * radius;
    }
}
