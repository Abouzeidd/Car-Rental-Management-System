import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    private final List<Rental> activeRentals = new ArrayList<>();

    // Rent a vehicle
    public Rental rentVehicle(String customer, String vehicle, int startDate, int endDate) {
        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is not available.");
            return null;
        }

        vehicle.setAvailability(false); // Mark vehicle as rented
        Rental rental = new Rental(customer, vehicle, startDate, endDate);
        activeRentals.add(rental);
        System.out.println("Rental created successfully!");
        return rental;
    }

    // Return a vehicle
    public void returnVehicle(Rental rental) {
        rental.getVehicle().setAvailability(true); // now it is available to be rented again
        activeRentals.remove(rental);
        System.out.println("Vehicle returned successfully.");
    }

    // Cancel a rental
    public void cancelRental(Rental rental) {
        rental.getVehicle().setAvailability(true); // now it is available to be rented again
        activeRentals.remove(rental);
        System.out.println("Rental has been cancelled.");
    }

    // Show all active rentals
    public void showActiveRentals() {
        if (activeRentals.isEmpty()) {
            System.out.println("No active rentals at the moment.");
            return;
        }

        System.out.println("📋 Current Active Rentals:");
        for (Rental rental : activeRentals) {
            System.out.println(rental);
            System.out.println("----------------------------");
        }
    }
}
