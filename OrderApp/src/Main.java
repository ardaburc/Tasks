import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your order number");
        int orderNumber = scanner.nextInt();

        switch (orderNumber){
            case 1:
                System.out.println("The product you have selected is COMPUTER");
                break;
            case 2:
                System.out.println("The product you have selected is GUITAR");
                break;

            case 3:
                System.out.println("The product you have selected is IPHONE");
                break;
            case 4:
                System.out.println("The product you have selected is XBOX");
                break;
            default:
                System.out.println("You entered an invalid order number!");
        }
        scanner.close();

    }
}