import java.util.Scanner;

public class BedenKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Beden kitle indeksi hesaplama
        double bedenKitleIndeksi = kilo / (boy * boy);

        // Beden kitle indeksi sonucunu ekrana yazdırma
        System.out.println("Beden Kitle İndeksiniz: " + bedenKitleIndeksi);

        // Sonuçları yorumlama
        if (bedenKitleIndeksi < 18.5) {
            System.out.println("Zayıf");
        } else if (bedenKitleIndeksi < 25) {
            System.out.println("Normal");
        } else if (bedenKitleIndeksi < 30) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }

        scanner.close();
    }
}
