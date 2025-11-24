public class Ogrenci {

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    private String ad;
    private String soyad;
    private int yas;
    private double puan;

    private static int kayitSirasi=0;

    public Ogrenci(String ad, String soyad, int yas, double puan) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.puan = puan;
        //Her yeni instance alındığında kayitSirasi değeri 1 artsın
        kayitSirasi++;
    }

    @Override
    public String toString() {
        return  kayitSirasi+". sırada:" + ad +" " + soyad;
    }

    public static int toplamOgrenciSayisi(){
        return kayitSirasi;
    }
}
