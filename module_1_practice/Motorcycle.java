class Motorcycle extends Vehicle {
    private String bodyType;
    private boolean hasBox;

    public Motorcycle(String brand, String model, int year, String bodyType, boolean hasBox) {
        super(brand, model, year);
        this.bodyType = bodyType;
        this.hasBox = hasBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean hasBox() {
        return hasBox;
    }

    @Override
    public String toString() {
        return super.toString() + ", Body Type: " + bodyType + ", Has Box: " + (hasBox ? "Yes" : "No");
    }
}