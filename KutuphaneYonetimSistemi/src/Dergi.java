public class Dergi extends Materyal {


    private int sayi;
    private String yayinTarihi;



    public Dergi(String id, String baslik, int sayi, String yayinTarihi, int stokAdedi) {
        super(id, baslik, stokAdedi);
        this.sayi = sayi;
        this.yayinTarihi = yayinTarihi;
    }

    @Override
    public String getTur() {
        return "Dergi";
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Kitap bilgileri");
        System.out.println("ID: " + getId());
        System.out.println("Başlık: " + getBaslik());

        System.out.println("Sayı"+sayi);
        System.out.println("Yayın tarihi"+ yayinTarihi);

        System.out.println("Stok: " + stokAdedi);



        System.out.println();
    }

    @Override
    public void OduncVer(String uye) throws StokYetersizException {
        if (!musaitMi()){
            throw  new StokYetersizException("Dergi stokta yok! "+ getBaslik());
        }

        stokAdedi--;

        System.out.println("Dergi, "+ uye + " kodlu üyeye ödünç verildi");

    }

    @Override
    public void iadeAl(String uye) {
        stokAdedi++;
        System.out.println("Dergi, "+ uye + " kodlu üyeden alındı");


    }

}
