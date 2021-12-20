package by.epam.lab;

public class DiscountProduct extends Product {
    private Byn priceDiscount;

    public DiscountProduct() {
        super();
        priceDiscount = new Byn(0);
    }

    public DiscountProduct(String name, Byn price, Byn priceDiscount) {
        super(name, price);
        this.priceDiscount = priceDiscount;
    }

    public Byn getPriceDiscount() {
        return priceDiscount;
    }

    @Override
    public Byn getPrice() {
        return super.getPrice().sub(priceDiscount);
    }

    protected String fieldsToString() {
        return String.format("%s;%s", super.fieldsToString(), priceDiscount);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", fieldsToString(), getPrice());
    }
}