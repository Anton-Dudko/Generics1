package by.epam.lab;

public class Utils<T extends Priceable> {
    private Purchase<T> purchase;

    public Utils(Purchase<T> purchase) {
        this.purchase = purchase;
    }

    public Utils(T item, Number quantity) {
        purchase = new Purchase<T>(quantity.doubleValue(), item);
    }

    public Purchase<T> getPurchase() {
        return purchase;
    }

    public void printPurchase() {
        System.out.println(purchase);
    }

    public void printCost() {
        System.out.println("cost = " + purchase.getCost());
    }

    public void printCostDiff(Purchase p) {
        Byn costDiff = new Byn(getPurchase().getCost().compareTo(purchase.getCost()));
        System.out.printf("diff = %s BYN%n", costDiff);
    }

    public void printIsSameCost(Purchase... purchases) {
        boolean b = false;
        for (Purchase p : purchases) {
            if (purchase.equals(p)) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("The purchase is in the array.");
        } else {
            System.out.println("The purchase not in the array");
        }
    }
}