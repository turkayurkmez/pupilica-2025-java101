public class Main {
    public static void main(String[] args) {


        String value ="Pupilica ile Java Temelleri";

        System.out.println(value.toLowerCase());
        System.out.println("İle kelimesi var mı: " + value.contains("ile"));

        System.out.println(value.getBytes());

        System.out.println(value.charAt(0));

        System.out.println(value.codePointAt(2));

        System.out.println(value.substring(3));

        //Pupilica
        //upilica P
        //pilica Pu
        //ilica Pup

        for (int i = 0; i < value.length() ; i++) {
            System.out.println(value.substring(i));

        }

        System.out.println(value.concat("deneme"));

        System.out.println(value.indexOf('a',17));







    }
}