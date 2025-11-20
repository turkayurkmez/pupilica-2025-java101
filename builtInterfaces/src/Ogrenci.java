public class Ogrenci implements Comparable<Ogrenci> {



    private String ad;
    private int yas;
    private int puan;


    public Ogrenci(){

    }

    public Ogrenci(String ad, int yas, int puan){
        this.ad = ad;
        this.yas =yas;
        this.puan = puan;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    @Override
    public String toString(){
        return  ad + "....... Yaş: " + yas + "........Puan:"  + puan;
    }

    @Override
    public int compareTo(Ogrenci o) {

//        if (this.puan > o.puan){
//            return  1;
//        } else if (this.puan < o.puan) {
//            return -1;
//        }
//        else{
//            return 0;
//        }

        return this.puan - o.puan;

    }
}
