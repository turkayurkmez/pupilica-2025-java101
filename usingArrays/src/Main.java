import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //1. Array içinde kaç eleman olacağını biliyorum. Ama elemanları bilmiyorum.
        String[] names = new String[5];
        names[0] ="Arda";
        names[1] = "Yeşim";
        names[2] = "Türkay";
        names[3] = "Numan";
        names[4] = "Cennet";
        //2. Elemanların tamamını, dolayısıyla kapasitesini biliyorum.
        String[] days = new String[]{ "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar","Test"};
        System.out.println(days[0]);
        System.out.println(days[4]);
        System.out.println("Dizinin eleman sayısı (length): "+ days.length);
        System.out.println("Dizinin son elemanı: "+ days[days.length -1]);
        //Problem: Kullanıcının girdiği iki haneli sayıyı okunuşuna çevirmek.
        //Örnek: 36 -> Otuz altı
        String[] birler = new String[]{"","bir","iki", "üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] onlar = new String[]{"","on","yirmi", "otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};

        System.out.println("İki basamaklı bir sayı giriniz!");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int onlarBasamagindakiRakam = sayi / 10;
        int birlerBasamagindakiRakam = sayi % 10;

        System.out.println(onlar[onlarBasamagindakiRakam]+ " " + birler[birlerBasamagindakiRakam]);











    }
}