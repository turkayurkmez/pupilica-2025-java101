import java.util.ArrayList;

public class Yemek {


    public Yemek(){

    }

    public Yemek(String ad, int pismeSuresi){
        this.ad = ad;
        this.pismeSuresi = pismeSuresi;
    }

    private String ad;
    private double fiyat;

    private ArrayList<String> malzemeler;

    private int pismeSuresi;

    public void Pisir(){
        System.out.println(getAd() + " isimli yemek, "+ getPismeSuresi() + " dakikada pişti!");
    }

    public void sunumYap(){
        System.out.println(getAd() + " ürünü, yanında pilav ile sunuldu");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public ArrayList<String> getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(ArrayList<String> malzemeler) {
        this.malzemeler = malzemeler;
    }

    public int getPismeSuresi() {
        return pismeSuresi;
    }

    public void setPismeSuresi(int pismeSuresi) {
        this.pismeSuresi = pismeSuresi;
    }

    protected String ekstraMalzeme;

    @Override
    public String toString(){
        return getAd() + " " + getPismeSuresi() +  "dakika, " + fiyat + " TL değerinde";
    }

}
