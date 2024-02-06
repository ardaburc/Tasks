import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını girin: ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println( i + ". Öğrenci Bilgileri:");

            System.out.print("Ad: ");
            String ad = scanner.next();

            System.out.print("Soyad: ");
            String soyad = scanner.next();

            System.out.print("1. Sınav Notu: ");
            double s1 = scanner.nextDouble();

            System.out.print("2. Sınav Notu: ");
            double s2 = scanner.nextDouble();

            System.out.print("3. Sınav Notu: ");
            double s3 = scanner.nextDouble();

            double ortalama = (s1 + s2 + s3) / 3;

            System.out.println("Ortalama: " + ortalama);
        }

        scanner.close();
    }
}