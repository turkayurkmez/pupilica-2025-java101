public class PDFDocument extends Document {
    @Override
    public void Load(String path) {
        System.out.println("PDF dosyası yükleniyor");
    }

    @Override
    public void Save(String path) {
        System.out.println("PDF dosyası kaydediliyor");

    }

//    @Override
//    public void Print() {
//        System.out.println("PDF dosyasının çıktısı alınıyor");
//
//    }
}
