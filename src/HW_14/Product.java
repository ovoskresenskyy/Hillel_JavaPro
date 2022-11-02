package HW_14;

import java.time.LocalDate;

public class Product {
    private final String type;
    private double price;
    private final boolean isDiscountPossible;
    private final LocalDate dateAdded;

    public Product(String type, int price, boolean isDiscountPossible, LocalDate dateAdded) {
        this.type = type;
        this.price = price;
        this.isDiscountPossible = isDiscountPossible;
        this.dateAdded = dateAdded;
    }

    public void applyDiscount(int percent) {
        this.price -= this.price * percent / 100;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountPossible() {
        return isDiscountPossible;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "\n" + type +
                "\nPrice: " + price +
                "\nDiscount possible: " + isDiscountPossible +
                "\nDate added: " + dateAdded +
                "\n";
    }
}
