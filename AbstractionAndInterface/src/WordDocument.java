public class WordDocument extends Document implements Printable {
    @Override
    public void Load(String path) {
        System.out.println("Word dosyası yükleniyor");
    }

    @Override
    public void Save(String path) {
        System.out.println("Word dosyası kaydediliyor");

    }


    public void Print() {
        System.out.println("Word dosyasının çıktısı alınıyor");

    }
}
