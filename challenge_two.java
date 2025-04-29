import java.util.Scanner;

class Discount {
    Scanner sc = new Scanner(System.in);

    void AMOUNT() {
        int discountPercentage = 25;
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double discount = amount * discountPercentage / 100;
        double newAmount = amount - discount;

        System.out.println("Your new amount after " + discountPercentage + "% discount is: " + newAmount);
    }

    public static void main(String[] args) {
        Discount d = new Discount();
        d.AMOUNT();
    }
}
