public abstract class Vehicle {
    protected String id;
    protected String brand;
    protected String model;
    protected double pricePerDay;
    protected boolean available;

    public Vehicle(String id, String brand, String model, double pricePerDay, boolean available) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public abstract String getDetails();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }


    public String getId() {
        return id;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
