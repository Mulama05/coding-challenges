import java.util.*;
import java.util.Scanner;
class PersonCredentials {
    Scanner sc = new Scanner(System.in);
    public void NameAndHeight(){
        System.out.print("Enter your Name: ");
        String name= sc.nextLine();
        System.out.println("Enter your Height in cm:");
        double height= sc.nextDouble();
        System.out.println(name + " is " + height + " cm");
    }
    public static void main (String [] args){
        PersonCredentials person = new PersonCredentials();
        person.NameAndHeight();
    }

}
