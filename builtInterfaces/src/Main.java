public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Sedef", 19,80);
        Ogrenci ogrenci2 = new Ogrenci("Fahrettin",21,75);
        Ogrenci ogrenci3 = new Ogrenci("Türkay",45,50);

        Sinif sinif = new Sinif();
        sinif.OgrenciEkle(ogrenci1);
        sinif.OgrenciEkle(ogrenci2);
        sinif.OgrenciEkle(ogrenci3);

        sinif.Sirala();

        for (Ogrenci ogrenci : sinif){
            System.out.println(ogrenci);
        }


    }
}