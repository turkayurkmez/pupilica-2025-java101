import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Türkay","Ürkmez",45,68);
        System.out.println(ogr1);


        Ogrenci ogr2 = new Ogrenci("Alptuğ", "Karakaş", 21,80);
        System.out.println(ogr2);

        Ogrenci ogr3 = new Ogrenci("Ümmühan", "Birol", 20,92);
        System.out.println(ogr3);

        System.out.println("Bellekteki toplam öğrenci sayısı:" + Ogrenci.toplamOgrenciSayisi());

       double kare = Geometri.kareAlani(5);


       //Geometri g = new Geometri();
       //g.olurMu();

      //Math m = new Math();















    }
}