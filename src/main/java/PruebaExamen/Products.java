package PruebaExamen;

public enum Products {

    BURRITOS(6.5, "Pin"),
    BURGERS(8.9, "Cap"),
    KEBAB(4.5, null),
    PIZZA(7.9, null);


    private double price;
    private String gift;

    Products(double price, String gift) {
        this.price = price;
        this.gift = gift;
    }

    public double getPrice() {
        return price;
    }

    public String getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "\t " + this.name() + " PRICE: " + this.price + "€ GIFT: " + this.gift;
    }
}