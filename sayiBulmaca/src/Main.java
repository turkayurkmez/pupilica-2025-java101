import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /*
        *
        * Amaç: Bigisayarın tuttuğu bir sayıyı, tahmin etmeye çalışmak.
        *
        *  1. Program, 1 ile 100 arasında rastgele bir sayı seçer.
        *  2.
        *     Kullanıcı sayıyı bilemediği SÜRECE
        *     - Kullanıcı, tahmini sayı girer.
        *     - 3. Girilen sayı tutulanla karşılaştırılır.
        *     a. Tutulan > Tahmin ise "yukarı"    yazar
        *     b. Tutulan < Tahmin "aşağı" yazar.
        *     c. Eşitse oyun biter.
        *   4. Eşitlik sağlanamazsa 2. Adıma döner.
        *
        * */

        Random sayiUretici = new Random();
        Scanner tarayici = new Scanner(System.in);
        int tutulan = sayiUretici.nextInt(1,100);
        boolean sayiBilindiMi=false;

        while (!sayiBilindiMi){
            System.out.println("Tahmininizi girin....");
            int tahmin = tarayici.nextInt();
            String yon = "";
            if (tutulan > tahmin){
               yon="YUKARI";
            }
            else if(tutulan < tahmin){
               yon = "Aşağı";
            }
            else{
                sayiBilindiMi = true;
            }

            System.out.println(yon);



        }

        System.out.println("Tebrikler! Bildiniz");



    }
}