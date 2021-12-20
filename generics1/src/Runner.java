import by.epam.lab.*;

public class Runner {
    public static void main(String[] args) {
        Purchase<Product> p1 = new Purchase<>(20, new Product("Milk", new Byn(170)));
        Utils<Product> pu1 = new Utils(p1);
        pu1.printPurchase();

        Purchase<Product> p2 = new Purchase<>(12.5, new Product("Sugar", new Byn(300)));
        Utils<Product> pu2 = new Utils(p2);
        pu2.printCost();
        pu2.printCostDiff(p1);

        Purchase<Product> p3 = new Purchase<>(60, new DiscountProduct("sugar", new Byn(280), new Byn(10)));

        Service s1 = new Service("gym_workout", new Byn(7560), 5);
        Utils<Service> pu4 = new Utils(s1, 2.25);

        Service service = pu4.getPurchase().getItem();
        System.out.println(service);

        pu4.printCost();
        pu2.printIsSameCost(p1, pu4.getPurchase(), p3);
    }
}