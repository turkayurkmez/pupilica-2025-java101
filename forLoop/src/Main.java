import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {32,65,13,95,8,24,54};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);

        int counter = 0;
        while (counter <= 5){
            System.out.println(numbers[counter++]);
        }
        System.out.println(".........................");

        for (int index = 0; index < numbers.length ; index++) {
            System.out.println(numbers[index]);
        }


        boolean negatifSayiVarMi = false;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < 0){
                negatifSayiVarMi = true;
                break;
            }
        }

        String durum = "";
        if (negatifSayiVarMi){
            durum = "Var";
        }
        else{
            durum="Yok";
        }

        String altDurum = negatifSayiVarMi ? "var":"yok";

        System.out.println("Negatif sayı "+ altDurum);

        int enBuyuk = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > enBuyuk){
                enBuyuk = numbers[i];

            }

        }

        System.out.println("En büyük sayı:"+ enBuyuk);

        for (int x = 1; x < 10 ; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.println(x + " x " + y + " = " + x*y);
            }
            System.out.println("-----------------------");
        }







    }
}