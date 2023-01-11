public class Product {
    public int total;
    private int id, price, number, promotion;
    private String name;
    public int totalP;
    public
    Product(int id, String name, int price, int number, int promotion){
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.promotion = promotion;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
    public int getPromotion() {
        return promotion;
    }
    public void Total(){

    }
    public void TotalP(){
    }

}
