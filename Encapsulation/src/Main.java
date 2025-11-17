import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();

        System.out.println("Ürün fiyatını giriniz:");
        Scanner scanner = new Scanner(System.in);

        double inputPrice = scanner.nextDouble();
//        if (inputPrice <= 0){
//            //System.out.println("Ürün fiyatı 0 veya negatif olamaz!");
//            throw new IllegalArgumentException("Ürün fiyatı 0 veya negatif olamaz!");
//        }
//
//        p1.Price = inputPrice;

        p1.setPrice(inputPrice);
        System.out.println( "Ürün fiyatı: " + p1.getPrice());

        p1.setStockCount(200);
        if (p1.isStockExisting()){
            System.out.println(p1.getName() + " ürününden stokta "+ p1.getStockCount() + "adet var") ;
        }
        else {
            System.out.println("Stokta yok");
        }







    }
}