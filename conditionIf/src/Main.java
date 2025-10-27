import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BMI:
        //Ağırlık (kg)/(boy- m)^2


        System.out.println("Lütfen kilonunuzu giriniz");
        Scanner scanner = new Scanner(System.in);

        try{

            int weight = scanner.nextInt();
            System.out.println("Lütfen boyunuzu girin:");
            double height = scanner.nextDouble();
            double  bmi = weight / (height * height);
            System.out.println("BMI değeriniz: "+ bmi);

            String status = "";

            if(bmi < 18.5){
                status = "ZAYIF";
            }
            else if(bmi >=18.5 && bmi <= 24.9 ){
               status = "Normal kilo";

            } else if (bmi >=25 && bmi <= 29.9) {
                status = "Fazla kilolu";
            } else if (bmi>=30 && bmi <= 34.9) {
                status = "1. Derece obez";
            }
            else {
                status ="Morbid obez";
            }

            System.out.println("BMI yorumunuz: "+ status);


        }
        catch (InputMismatchException ex){
            System.out.println("Lütfen kilo için tam sayı boy için virgül ile ayrılmış ondalıklı sayı giriniz");
        }
        catch (ArithmeticException ex){
            System.out.println("Tam sayılar 0'a bölünemez!!!");
        }
        catch (Exception exception){
            System.out.println("BİLNMEYEN BİR HATA MEYDANA GELDİ! Hata Mesajı:");
            System.out.println(exception.getMessage());
        }




    }
}