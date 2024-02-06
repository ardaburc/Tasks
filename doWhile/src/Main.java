import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Do-While döngüsü verilen bir şart gerçekleşene kadar o işlem yapmaya devam eden bir süreçtir

        // 1'den 5'e kadar olan sayıları yazdırma

        int sayi = 1;

        do {
            System.out.println("Sayı: " + sayi);
            sayi++;
        } while (sayi <= 5);




        // Kullanıcı 0 girene kadar girilen sayıları topla

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi;

        do {
            System.out.print("Bir sayı girin (0 girerek çıkış yapabilirsiniz): ");
            girilenSayi = scanner.nextInt();
            toplam += girilenSayi;
        } while (girilenSayi != 0);

        System.out.println("Toplam: " + toplam);

        scanner.close();

        /* Kullanıcıdan bir şifre girişi yapılana kadar şifre isteme


            Scanner scanner = new Scanner(System.in);
            String dogruSifre = "şifre123";
            String girilenSifre;

            do {
                System.out.print("Şifreyi girin: ");
                girilenSifre = scanner.next();
            } while (!girilenSifre.equals(dogruSifre));

            System.out.println("Giriş başarılı!");

            scanner.close();
            */

    }
}