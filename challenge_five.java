import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();

        int number = r.nextInt(10);
        double value = r.nextDouble();

        System.out.println("Random number: " + number);
        System.out.println("Random value: " + value);
    }
}
