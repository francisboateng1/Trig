// Java program to display sine and cosine of 30 degrees
public class Main {
    public static void main(String[] args) {
        double degrees = 30.0;

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Calculate sine and cosine
        double sineValue = Math.sin(radians);
        double cosineValue = Math.cos(radians);
        double tangentValue =Math.tan(radians);

        // Display results with formatting
        System.out.printf("Sine of %.1f degrees = %.4f%n", degrees, sineValue);
        System.out.printf("Cosine of %.1f degrees = %.4f%n", degrees, cosineValue);
        System.out.printf("Tangent of %.1f degrees = %.4f%n", degrees, tangentValue);

    }
}

