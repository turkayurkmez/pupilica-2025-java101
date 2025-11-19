public class ExcelDocument extends Document implements Printable {
    @Override
    public void Load(String path) {
        System.out.println("Excel dosyası yükleniyor");
    }

    @Override
    public void Save(String path) {
        System.out.println("Excel dosyası kaydediliyor");

    }
    public void Print() {
        System.out.println("Excel dosyasının çıktısı alınıyor");

    }
}
