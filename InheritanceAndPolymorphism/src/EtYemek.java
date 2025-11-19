public class EtYemek extends Yemek {


    public EtYemek(){
        super();
    }

    public EtYemek(String ad, int pismeSuresi) {
        super(ad,pismeSuresi);
    }

    private EtPismeTipi  pismeTipi;

    private  EtTuru etTuru;


    public EtPismeTipi getPismeTipi() {

        return pismeTipi;
    }

    public void setPismeTipi(EtPismeTipi pismeTipi) {
        this.pismeTipi = pismeTipi;
    }

    public EtTuru getEtTuru() {
        return etTuru;
    }

    public void setEtTuru(EtTuru etTuru) {
        this.etTuru = etTuru;
    }
}

