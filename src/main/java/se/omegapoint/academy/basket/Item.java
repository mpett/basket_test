package se.omegapoint.academy.basket;

public abstract class Item {
    private double priceWithoutTax;
    private double tax;

    public Item(double price, double tax) {
        this.priceWithoutTax = price;
        this.tax = tax;
    }

    public double getPriceWithTax() {
        return (priceWithoutTax * (1.0 + tax));
    }


}
