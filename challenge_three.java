import javax.swing.*;
import java.util.*;
class Vendor{
    Scanner sc = new Scanner(System.in);

    //outputs hello while user wants to
    void showDecision(){
        int price;
        System.out.print("Enter price of your choice : ");
        price = sc.nextInt();
        if (price>2000){
            System.out.println("fair enough i will sell it to you.");
        }
        else
        {
            System.out.println("that is too little try somewhere else");
        }

    }

    public static void main(String[] args){
        Vendor l = new Vendor();
        l.showDecision();
    }
}
