import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Java'da temel veri tipleri
        /*
        Burası, paragraf
        biçiminde
        açıklama
        satırlarıdır.

        * */

        /*
          1. Sözel veriler
          2. Sayısal veriler
          3. Mantıksal veri
        * */

        int bulundugumYil = LocalDate.now().getYear();

        System.out.println("Lütfen doğum yılınızı 4 haneli olarak girin!");
        //ekrandan girilen veriyi okumak için Scanner nesnesi oluşturuyoruz:
        Scanner scanner = new Scanner(System.in);

        int dogumYili = scanner.nextInt();

        int yas = bulundugumYil - dogumYili;
        System.out.println("Yaşınız: " +yas);
        //tam sayılar
        byte enKucukByte = -128; //8 bit
        byte enBuyukByte = 127;

        short onaltiBit = 32767; //16 bit

        int otuzikiBit = 2000000000;
        long altmisdortBit = 2000000000000L;

        //ondalıklı sayilar:
        float ates = 36.55f; //düşük hassasiyetli işlemler için -> yavaş yazma
        double fiyat = 3.99; //hassasiyeti daha yüksek işlemler için -> hızlı yaz.

        int sayi1 = 15;
        int sayi2 = 6;
        int bolumInt = sayi1 / sayi2;

        double sayi3 = 15;
        double sayi4 = 6;
        double bolumDouble = sayi3 / sayi4;

        System.out.println("Tam sayı sonuç:" + bolumInt);
        System.out.println("Ondalıklı sayı sonuç:" + bolumDouble);

        char ilkHarf = 'A';
        //Ali
        String isim = "Ali";

        boolean derstenGectiMi = true;
        boolean buyukMu = sayi4 > 3;

        //Implicit (Otomatik) casting:
        //Çeviri  ve  Casting:
        //Casting aynı türde verilerin birbirlerine dönüşmesi
        //Çeviri (Convert): Farklı türde verilerin birbirlerine dönüşmesi

        byte sayi = 100;
        int otomatikCasting = sayi;
        //long test = otomatikCasting;

        //Explicit (Zorla) casting:
        int x  = 130;
        byte b = (byte) x;
        System.out.println("b değişkeninin değeri:"+b);

        //Convert
        String number = "56";
        int num = Integer.parseInt(number);


    }
}