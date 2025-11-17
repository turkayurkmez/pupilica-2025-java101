public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        int x = 5;
        product1.Name = "Şapka";
        product1.Price = 500;

        System.out.println(product1.Name);

        Product product2 = new Product();
        product2.Name = "Ceket";
        product2.Price = 2500;

        Product product3 = product2;

        product3.Name = "Gömlek";

        System.out.println(product2.Name);

        Otomobil clio = new Otomobil();
        clio.startStop();
        clio.hareketEt();

        for (int i = 0; i < 10; i++) {
            clio.gazaBas();
            System.out.println(clio.guncelHiz());
        }

        for (int i = 0; i < 10; i++) {
            clio.freneBas();
            System.out.println(clio.guncelHiz());

        }

        clio.durdur();


    }
}