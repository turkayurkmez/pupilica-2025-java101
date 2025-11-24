import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(" KÜTÜPHANE YÖNETİM SİSTEMİ ");

        ArrayList<Kitap> kitaplar = new ArrayList<>();
        ArrayList<Dergi> dergiler = new ArrayList<>();

        HashMap<String, String> uyeler = new HashMap<>();

        String[] romanKategorileri = {"Roman","Edebiyat"};
        String[] bilimKategorileri = {"Bilim","Fizik"};
        String[] felsefeKategorileri = {"Felsefe","Zihin felsefesi"};


        Kitap kitap1 = new Kitap("K001","Tutunamayanlar", "Oğuz Atay",500,3,romanKategorileri);
        Kitap kitap2 = new Kitap("K002","Zamanın kısa tarihi", "Stephen Hawking",250,4,bilimKategorileri);

        Kitap kitap3 = new Kitap("K003","Zihnin Anaşlizi", "Bertrand Russel",250,5,felsefeKategorileri);

        Kitap kitap4 = new Kitap("K004","Suç ve Ceza","Dostoyevski",5);

        Dergi dergi1 = new Dergi("D001","Bilim ve Teknik", 75, "Aralık 2025",10 );

        kitaplar.add(kitap1);
        kitaplar.add(kitap2);
        kitaplar.add(kitap3);
        kitaplar.add(kitap4);

        dergiler.add(dergi1);

        uyeler.put("U001","Türkay Ürkmez");
        uyeler.put("U002","Ayşe Kaya");

        System.out.println("Kayıtlı üyeler");

        for (Map.Entry<String,String> entry: uyeler.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }

        Kutuphaneci kutuphaneci1 = new Kutuphaneci("Derya", "P001");
        Kutuphaneci kutuphaneci2 = new Kutuphaneci("Bülent", "P002");

        //materyalleri listele:
        materyalleriListele(kitaplar,"Mevcut Kitaplar");
        materyalleriListele(dergiler,"Mevcut Dergiler");

        ArrayList<Kitap> romanlar = kategoriyeGoreFiltrele(kitaplar,"Roman");

        kutuphaneci1.oduncIslemiYap(kitap1,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));

        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));
        kutuphaneci1.oduncIslemiYap(kitap2,uyeler.get("U001"));


        kutuphaneci1.iadeIslemiYap(kitap2,uyeler.get("U001"));

        Sepet<Kitap> kitapSepeti = new Sepet<>();
        kitapSepeti.ekle(kitap3);
        kitapSepeti.ekle(kitap4);

        kitapSepeti.listele();

        for (Kitap kitap: kitapSepeti){
            kutuphaneci2.oduncIslemiYap(kitap,uyeler.get("U002"));
        }




    }



    public static <T extends Materyal> void materyalleriListele (ArrayList<T> liste, String baslik ){
        System.out.println("==== " + baslik + "======");
        for (T materyal : liste){
            System.out.println("- "+ materyal.getId()+ "|" + materyal.getBaslik() + "|" + materyal.getStokAdedi());
        }
    }

    private static ArrayList<Kitap> kategoriyeGoreFiltrele(ArrayList<Kitap> kitaplar, String tur) {

        ArrayList<Kitap> filtrelenmisSonuc = new ArrayList<>();
        for (Kitap kitap: kitaplar){
            for (String kategori : kitap.getKategoriler())
            {
                if (kategori.equalsIgnoreCase(tur)){
                    filtrelenmisSonuc.add(kitap);
                    break;
                }
            }

        }
        return filtrelenmisSonuc;
    }
}