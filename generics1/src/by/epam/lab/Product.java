package by.epam.lab;

public class Product implements Priceable{
    private final String name;
    private final  Byn price;

    public Product() {
        name = "";
        price = new Byn(0);
    }

    public Product(String name, Byn price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price){
        this(name, new Byn(price));
    }

    public String getName() {
        return name;
    }

    @Override
    public Byn getPrice() {
        return price;
    }

    protected String fieldsToString() {
        return String.format("%s;%s", name, price);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", fieldsToString(), getPrice());
    }
}
