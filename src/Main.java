import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     Rectangle rectangle=new Rectangle();
        System.out.println("Tort burchtuktun burchtarynyn aianttaryn jazynyz");
     rectangle.setA(scanner.nextInt());
        rectangle.setB(scanner.nextInt());
        rectangle.setC(scanner.nextInt());
        rectangle.setD(scanner.nextInt());
        System.out.println("Tort burchtuktun aianty");
        rectangle.rezult();
    }
}