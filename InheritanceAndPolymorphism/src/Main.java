import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Yemek bezelye = new Yemek();
        bezelye.setAd("Patatesli bezelye");
        bezelye.setPismeSuresi(15);


        EtYemek kebap = new EtYemek();
        kebap.setEtTuru(EtTuru.KirmiziEt);
        kebap.setPismeTipi(EtPismeTipi.Cok);
        kebap.setAd("Özel bilmemne kebabı");
        kebap.setPismeSuresi(30);



        SebzeYemek enginar = new SebzeYemek();
        enginar.setZeytinYagliMi(true);
        enginar.setSogukYenirMi(true);
        enginar.setAd("Ege usülü enginar kalbi");
        enginar.setPismeSuresi(45);


        Asci asci = new Asci();
        asci.Pisir(bezelye);
        asci.Pisir(kebap);
        asci.Pisir(enginar);

        Yemek yemek2 = new SebzeYemek();

        Yemek yemek3 = (Yemek)enginar;
        System.out.println("Ben enginarım... Adım: "+ yemek3.getAd());
        System.out.println("Ben yemek türünden dönüştüm:" + ((SebzeYemek)yemek3).isZeytinYagliMi());


        Yemek yemek4 = new Yemek("test",15);
        SebzeYemek yemek5 = new SebzeYemek();

        Tatli tulumba = new Tatli();
        tulumba.setAd("Tulumba tatlısı");
        tulumba.setPismeSuresi(20);

        asci.Pisir(tulumba);

        Yemek y = new Tatli();
        y.sunumYap();
        Yemek y2 = (Yemek)tulumba;
        y2.sunumYap();

        System.out.println(y.toString());
        System.out.println(kebap.toString());
        System.out.println(enginar);


        Random random = new Random();
        System.out.println(random.toString());



    }
}