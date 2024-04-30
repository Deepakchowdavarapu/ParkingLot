package Repositries;

import Modules.Vehicle;
import java.util.*;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new HashMap<>();
    public Optional<Vehicle> findByNumber(String vehiclenumber) {
        if (vehicles.containsKey(vehiclenumber)) {
            return Optional.of(vehicles.get(vehiclenumber));
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        vehicles.put(vehicle.getVehiclenumber(), vehicle);
        return vehicle;
    }

}
