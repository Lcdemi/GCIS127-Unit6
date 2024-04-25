package unit06;

public enum Material {
    CERAMIC(10),
    STAINLESS_STEEL(5),
    GLASS(3),
    BAMBOO(1),
    PORCELAIN(7),
    PLASTIC(0.25);

    private double price;

    private Material(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name() + " (" + price + ")";
    }
}
