public class Product {

    private double price;

    public void setPrice(double value){
        if (value<=0){
            throw new IllegalArgumentException("Ürün fiyatı 0 ya da negatif olamaz!");
        }

        price = value;
    }

    public double getPrice(){
        return price;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ürün stok:

    private boolean stockExisting;

    private int stockCount;


    public boolean isStockExisting() {
        return stockCount > 0;
    }



    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
}
