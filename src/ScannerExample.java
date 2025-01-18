import javax.swing.*;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir metin girişi al
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();
        System.out.println("Girdiğiniz metin: " + metin);

        // Kullanıcıdan bir sayı girişi al
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi);

        // Scanner'ı kapat
        scanner.close();

    }

}
