public class Kutuphaneci {
    private String ad;
    private String sicilNo;

    public Kutuphaneci(String ad, String sicilNo) {
        this.ad = ad;
        this.sicilNo = sicilNo;
    }

    public String getAd() {
        return ad;
    }

    public void oduncIslemiYap(Materyal materyal, String uye){
        try {
            System.out.println(ad + " ödünç verme işlemi başlatıyor");
            materyal.OduncVer(uye);
        }
        catch (StokYetersizException e){
            System.out.println("HATA!!!" + e.getMessage() );
        }
    }

    public void iadeIslemiYap(Materyal materyal, String uye){
        System.out.println(ad + " iade işlemi başlatıyor");
        materyal.iadeAl(uye);
    }
}
