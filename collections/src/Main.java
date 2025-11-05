import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


       int[] numbers =  {65,50,11,66,87,47};
       Object[] boxes = {"Türkiye",60,true};
       int total = 0;
        for (int i = 0; i <numbers.length ; i++) {
            total += numbers[i];
        }

        int average = total / numbers.length;
        System.out.println(average);

        //int[] copyNumbers = new int[numbers.length+1];
        String test = "deneme";
        //BOXING ve UNBOXING Sevmiyoruz!
//        Object kutu = test;
//        Object box = true;
//
//        String isTrue = (String) box;


        ArrayList<Integer> population = new ArrayList<>();


        ArrayList<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Eskişehir");
        cities.add("Konya");

//        for (int i = 0; i < cities.size() ; i++) {
//            System.out.println(cities.get(i));
//        }

        System.out.println(cities);

        System.out.println("........(forEach)");


        //for each:
       showArraylistItems(cities);

        cities.remove("Konya");
        System.out.println("-----");

      showArraylistItems(cities);

        if (cities.contains("Eskişehir")){
            System.out.println("Eskişehir, koleksiyonda var");
        }

        System.out.println(cities);
        cities.add("Eskişehir");
        System.out.println(cities);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Elma");
        fruits.add("Elma");
        fruits.add("Vişne");

        System.out.println(fruits);

        HashMap<String, String> plates = new HashMap<>();
        plates.put("01","Adana");
        plates.put("02","Adıyaman");
        plates.put("06","Ankara");
        plates.put("26","Eskişehir");
        plates.put("34","İstanbul");

        System.out.println(plates.get("06"));

        System.out.println(plates);


    }

    static void showArraylistItems(ArrayList<String> cities){
        for(String city : cities){
            System.out.println(city);
            //yapamazsınız:
            //cities.add("Sivas");

        }
    }
}