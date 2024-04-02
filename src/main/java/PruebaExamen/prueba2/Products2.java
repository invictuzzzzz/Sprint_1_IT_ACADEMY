package PruebaExamen.prueba2;

public enum Products2 {

    BURRITO(6.5, "Pin"),
    HAMBURGUESA(8.9, "Gorra"),
    KEBAB(4.5, null),
    PIZZA(7.5, null);

    private double price;
    private String gift;

    Products2(double price, String gift) {
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
        return this.name() + " PRICE: " + this.price + "€. GIFT: " + this.gift;
    }
}
