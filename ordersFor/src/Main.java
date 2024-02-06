import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double elmaFiyati = 5.0;
        double armutFiyati = 4.0;
        double muzFiyati = 6.0;
        double portakalFiyati = 3.5;

        int toplamFiyat = 0;

        for (int i = 0; i < 4; i++) {
            // Kullanıcıdan sipariş numarasını al
            System.out.print("Sipariş numarasını giriniz (1:Elma, 2:Armut, 3:Muz, 4:Portakal, 0:Çıkış): ");
            int siparisNumarasi = scanner.nextInt();

            if (siparisNumarasi == 0) {
                break; // 0 girildiğinde döngüden çık
            }

            int adet;
            switch (siparisNumarasi) {
                case 1:
                    System.out.print("Kaç adet Elma almak istiyorsunuz? ");
                    adet = scanner.nextInt();
                    toplamFiyat += elmaFiyati * adet;
                    break;
                case 2:
                    System.out.print("Kaç adet Armut almak istiyorsunuz? ");
                    adet = scanner.nextInt();
                    toplamFiyat += armutFiyati * adet;
                    break;
                case 3:
                    System.out.print("Kaç adet Muz almak istiyorsunuz? ");
                    adet = scanner.nextInt();
                    toplamFiyat += muzFiyati * adet;
                    break;
                case 4:
                    System.out.print("Kaç adet Portakal almak istiyorsunuz? ");
                    adet = scanner.nextInt();
                    toplamFiyat += portakalFiyati * adet;
                    break;
                default:
                    System.out.println("Geçersiz sipariş numarası! Lütfen geçerli bir numara giriniz.");
                    i--; // Hatalı giriş durumunda i'yi azaltarak döngüyü tekrarlat
            }
        }

        // Toplam fiyatı göster
        System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");

        scanner.close();
    }
}