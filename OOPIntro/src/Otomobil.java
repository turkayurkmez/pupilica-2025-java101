

public class Otomobil {

    //Otomobil nesnesi ile ................ yapabilirim
    //veya
    //Otomobil nesnesi ..................... yapar.


    private boolean calisiyorMu = false;


    public void hareketEt(){
        if (calisiyorMu){
            System.out.println("Araba hareket etti.");
        }
        else{
            System.out.println("Kontakt kapalı");
        }
    }

    public void startStop(){
       calisiyorMu = !calisiyorMu;
       String message = calisiyorMu ? "Motor çalıştı": "motor durdu";
       System.out.println(message);
    }

    private int hiz =0;
    public void gazaBas(){
        hiz += 5;
    }

    public void freneBas(){
        if (hiz>5){
            hiz -=5;
        }
    }

    public int guncelHiz(){
        return hiz;
    }

    public void durdur(){
        hiz = 0;
        System.out.println("araba durduruldu");
    }


}
