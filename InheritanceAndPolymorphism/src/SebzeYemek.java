public class SebzeYemek extends Yemek{

    public SebzeYemek(){
        this.ekstraMalzeme ="Limon";
        super.ekstraMalzeme ="Limon";
    }
    private boolean zeytinYagliMi;
    private boolean sogukYenirMi;

    public boolean getSogukYenirMi(){
        return sogukYenirMi;
    }

    public void setSogukYenirMi(boolean value){
        sogukYenirMi=value;
    }

    public boolean isZeytinYagliMi(){
        return zeytinYagliMi;
    }

    public void setZeytinYagliMi(boolean value){
        zeytinYagliMi = value;
    }
}
