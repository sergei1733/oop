package exercises10;

public class Basket extends Product{
    private Product[] products = new Product[5];

    public Basket(String name, String price, Integer rating) {
        super(name, price, rating);
    }

    public Basket(String name, String price, Integer rating, Product[] products) {
        super(name, price, rating);
        this.products = products;
    }
}
