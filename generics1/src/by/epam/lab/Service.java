package by.epam.lab;

public class Service implements Priceable {
    private String name;
    private Byn totalCost;
    private int users;

    public Service(String name, Byn totalCost, int users) {
        this.name = name;
        this.totalCost = totalCost;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public Byn getTotalCost() {
        return totalCost;
    }

    public int getUsers() {
        return users;
    }

    @Override
    public Byn getPrice() {
        return totalCost.mul(1.0 / users, RoundMethod.CEIL, 0);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s", name, getPrice(), totalCost, users);
    }

}
