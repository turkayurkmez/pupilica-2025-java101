public class Tatli extends Yemek{

   private boolean serbetliMi;

    public boolean isSerbetliMi() {
        return serbetliMi;
    }

    public void setSerbetliMi(boolean serbetliMi) {
        this.serbetliMi = serbetliMi;
    }
    @Override
    public void sunumYap(){
        System.out.println(getAd()+ " yanında dondurma ile sunuldu");
    }
}
