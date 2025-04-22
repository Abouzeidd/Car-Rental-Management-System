public class Rental {
    private final String Customer;
    private final String Vehicle;
    private final int StartDate;
    private final int EndDate;
    private final double Cost;

    public Rental(String Customer, String Vehicle, int StartDate, int EndDate, double Cost) {
        this.Customer = Customer;
        this.Vehicle = Vehicle;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Cost = CalculateCost();
    }

//    calculate the total cost
    private double CalculateCost() {
        long days = (EndDate - StartDate) + 1;

        if(days <= 0)
            days = 1;

        return days * vehicle.getPricePerDay();
    }

//    display the rent details
    @Override
    public String toString() {
        return "Rental Transactions:\n" +
                "Customer: " + Customer.getName() + "\n" +
                "Vehicle: " + Vehicle.getBrand() + " " + vehicle.getModel() + "\n" +
                "Start Date: " + StartDate + "\n" +
                "End Date: " + EndDate + "\n" +
                "Cost: $" + Cost;
    }
}
