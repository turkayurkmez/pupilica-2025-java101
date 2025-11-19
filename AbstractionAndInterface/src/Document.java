public abstract class Document {

    public void Copy(String from, String to){
        System.out.println("Dosya kopyalandı...");
    }

    public void Move(String from, String to){
        System.out.println("Dosya taşındı..");

    }

    public abstract void Load(String path);

    public abstract void Save(String path);

    //Her document nesnesinin çıktısı alınmaması yönünde karar verildi
   // public abstract void Print();
}
