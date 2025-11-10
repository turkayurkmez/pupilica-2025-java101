public class Main {
    public static void main(String[] args) {

        alanHesapla(3, "Kare");

    }


    /**
     * Parametre olarak aldığı değerleri kullanarak kare veya daire şekillerinin alanlarını hesaplar.
     *
     * @param  birim1  Kare için kenar, daire için yarı çap uzunluğu
     * @param  sekil 'Daire' veya 'Kare'
     * @return      seçilen şeklin alanı
     * @see         Double
     */
    static double alanHesapla(double birim1, String sekil){

        double sonuc = 0;
        switch (sekil){
            case "Kare":
                return Math.pow(birim1,2);
            case "Daire":
                return Math.PI * Math.pow(birim1,2);

            default:
               return 0;

        }
      }

   static double alanHesapla(double birim1, double birim2, String sekil){
        double sonuc = 0;
        switch (sekil){
            case "Üçgen":
                return (birim1 * birim2) / 2;
            case "Dikdörtgen":
                return birim1 * birim2;

            default:
                return 0;

        }
    }
}