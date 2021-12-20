package by.epam.lab;

public class Purchase<T extends Priceable> implements Comparable<Purchase<T>> {
    private Number quantity;
    private T item;

    public Purchase() {
    }

    public Purchase(double quantity, T item) {
        this.quantity = quantity;
        this.item = item;
    }

    public Number getQuantity() {
        return quantity;
    }

    public T getItem() {
        return item;
    }

    protected String fieldsToString() {
        return String.format("%s;%.2f", item, quantity);
    }

    public Byn getCost() {
        return item.getPrice().mul(quantity.doubleValue(), RoundMethod.ROUND, 0);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", fieldsToString(), getCost());
    }

    @Override
    public int compareTo(Purchase o) {
        return getCost().compareTo(o.getCost());
    }
}
