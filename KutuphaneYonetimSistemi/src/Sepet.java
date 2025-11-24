import java.util.ArrayList;
import java.util.Iterator;

public class Sepet <T extends Materyal> implements Iterable<T> {
    private ArrayList<T> materyaller;

    public Sepet() {
        this.materyaller =new ArrayList<>();
    }

    public void ekle(T materyal){
        materyaller.add(materyal);
        System.out.println("Sepete eklendi:" + materyal.getBaslik());
    }

    public void listele(){
        System.out.println("----- Sepettekiler ---------");

        if (materyaller.isEmpty()){
            System.out.println("Sepetiniz boş");
        }
        else{
            for(T materyal : materyaller){
                System.out.println("- " + materyal.getTur() + ": " + materyal.getBaslik() ) ;
            }
        }

    }

    public int adet(){
        return materyaller.size();
    }

    @Override
    public Iterator<T> iterator() {
        return materyaller.iterator();
    }
}
