public class Kitap extends Materyal {


    private String yazar;
    private int sayfaSayisi;
    private String[] kategoriler;

    public String getYazar() {
        return yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public String[] getKategoriler() {
        return kategoriler;
    }

    public Kitap(String id, String baslik, String yazar, int sayfaSayisi, int stokAdedi, String[] kategoriler) {
        super(id, baslik, stokAdedi);
        this.yazar =yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.kategoriler = kategoriler;
    }

    public Kitap(String id, String baslik, String yazar, int stokAdedi) {
        this(id,baslik,yazar,0,stokAdedi,new String[]{"Genel"});
    }

    @Override
    public String getTur() {
        return "Kitap";
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Kitap bilgileri");
        System.out.println("ID: " + getId());
        System.out.println("Başlık: " + getBaslik());
        System.out.println("Yazar: " + yazar);
        System.out.println("Sayfa sayısı " + sayfaSayisi);
        System.out.println("Stok: " + stokAdedi);

        System.out.println("Kategoriler:");
        System.out.println(String.join(",",kategoriler));
        System.out.println();


    }

    @Override
    public void OduncVer(String uye) throws StokYetersizException {
         if (!musaitMi()){
             throw new StokYetersizException("Kitap stokta yok:"+getBaslik());
         }

         stokAdedi--;
         System.out.println("Kitap ödünç verildi...."+ getBaslik() + "-->" + uye);
    }

    @Override
    public void iadeAl(String uye) {
        stokAdedi++;
        System.out.println("Kitap iade edişldi..."+ getBaslik() + "<--" + uye);

    }
}
