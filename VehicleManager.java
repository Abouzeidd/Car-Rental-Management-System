import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String id) {
        vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
    }

    public Vehicle searchVehicleById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                availableVehicles.add(v);
            }
        }
        return availableVehicles;
    }
}
