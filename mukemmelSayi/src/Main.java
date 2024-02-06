import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 1) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            int toplam = 0;

            for (int i = 1; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        }

        scanner.close();
    }
}