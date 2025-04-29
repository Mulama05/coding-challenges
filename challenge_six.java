import java.util.Scanner;

class Person {
    private int age;

   
    public Person(int age) {
        this.age = age;
    }

    
    public boolean isAdult() {
        return age >= 18;
    }
}

public class AdultChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        char repeat;

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            Person person = new Person(age);

            if (person.isAdult()) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are not an adult.");
            }

            System.out.print("Do you want to check another age? (y/n): ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');

        scanner.close();
        System.out.println("Program ended.");
    }
}
