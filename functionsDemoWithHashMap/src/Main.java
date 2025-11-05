import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * 1. Kullanıcı menü içinden seçim yapar.
        *    1. Plaka gir
        *    2. Plaka ara
        * 2. Seçime göre;
        *    1'i seçerse Kullanıcıdan plaka girmesini iste.
        *        Eğer plaka yoksa, eklesin
        *        Varsa "zaten var" desin.
        *    2'yi seçerse, aranacak plakayı istesin
        *        Varsa şehri yazsın.
        *        Yoksa "bulunamadı" desin.
        * */
        int userChoose = chooseFromMenu();
        navigate(userChoose);



    }

    static int chooseFromMenu(){
        System.out.println("Lütfen aşağıdaki seçeneklerden birini işaretleyin:\n1. Plaka kaydet\n2. Plaka ara");

        int choose = 0;
        boolean isFault = false;

        do {
            isFault = false;
            try {
                Scanner scanner = new Scanner(System.in);
                choose = scanner.nextInt();
                if (choose > 2) {
                    System.out.println("Seçiminiz, 1 veya 2 olmalı");
                    isFault = true;
                }
            } catch (Exception ex) {
                System.out.println("Lütfen sadece 1 ya da 2 girin");
                isFault = true;
            }
        }while (isFault);

        return choose;


    }

    static void navigate(int choose){
        switch (choose){
            case 1:
                getPlateDataFromUser();
                break;
            case 2:
                System.out.println("Plaka arama seçildi");

                break;
        }
    }

    static HashMap<String,String> plates = new HashMap<>();

    static boolean addPlate(String plate, String city){

            if (plates.containsKey(plate)){
                return false;
            }

            plates.put(plate,city);
            return true;

    }

    static void getPlateDataFromUser(){
        boolean isSuccess = false;
        String answer = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen plaka girin");
            String plate = scanner.next();
            System.out.println("Şehri girin:");
            String city = scanner.next();
            isSuccess = addPlate(plate,city);
            if (!isSuccess){
                System.out.println("Bu plaka zaten kayıtlı. Yeni plaka giriniz.");

            }
            else{
                System.out.println("Başka plaka kaydetmek ister misiniz? (E/H)");
                answer = scanner.next();

            }

        }while (!isSuccess || answer.equals("E"));
    }



}