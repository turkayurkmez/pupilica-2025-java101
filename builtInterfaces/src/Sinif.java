import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sinif implements Iterable<Ogrenci> {

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public void OgrenciEkle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }

    public ArrayList<Ogrenci> getOgrenciler(){
        return ogrenciler;
    }

    public void Sirala(){
        ogrenciler.sort(null);
    }

    @Override
    public Iterator<Ogrenci> iterator() {
        return ogrenciler.iterator();
    }
}
