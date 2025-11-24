public abstract class Materyal implements OduncVerilebilir{


    private String id;
    private String baslik;
    protected int stokAdedi;

    private static int toplamMateryal = 0;

    public static int getToplamMateryal(){
        return toplamMateryal;
    }

    public String getId() {
        return id;
    }

    public String getBaslik() {
        return baslik;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public Materyal(String id, String baslik, int stokAdedi) {
        this.id = id;
        this.baslik = baslik;
        this.stokAdedi = stokAdedi;
        toplamMateryal++;
    }


    @Override
    public void OduncVer(String uye) throws StokYetersizException {

    }

    @Override
    public void iadeAl(String  uye) {

    }

    @Override
    public boolean musaitMi() {
       return stokAdedi> 0;
    }

    public abstract  String getTur();
    public  abstract void bilgiGoster();
}


