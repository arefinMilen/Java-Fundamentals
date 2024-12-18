/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransportSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

class Vehicle {
    private String name;
    private Coordinate coordinate;

    public Vehicle(String name, Coordinate coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}

class VehicleTrackingSystem {
    private Map<String, Vehicle> vehicles;

    public VehicleTrackingSystem() {
        this.vehicles = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getName(), vehicle);
    }

    public void removeVehicle(String name) {
        vehicles.remove(name);
    }

    public void updateVehiclePosition(String name, Coordinate newCoordinate) {
        Vehicle vehicle = vehicles.get(name);
        if (vehicle != null) {
            vehicle.setCoordinate(newCoordinate);
        }
    }

    public Map<String, Vehicle> getAllVehicles() {
        return vehicles;
    }
}

public class LiveVehicleTrackingSystem {
    private static VehicleTrackingSystem trackingSystem = new VehicleTrackingSystem();

    public static void main(String[] args) {
        simulateVehicleTracking();
    }

    private static void simulateVehicleTracking() {
        // Add vehicles to the tracking system
        trackingSystem.addVehicle(new Vehicle("Vehicle 1", new Coordinate(37.7749, -122.4194)));
        trackingSystem.addVehicle(new Vehicle("Vehicle 2", new Coordinate(34.0522, -118.2437)));
        trackingSystem.addVehicle(new Vehicle("Vehicle 3", new Coordinate(40.7128, -74.0060)));

        // Simulate updating vehicle positions
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(5000); // Update every 5 seconds

                // Generate random coordinates for each vehicle
                for (Vehicle vehicle : trackingSystem.getAllVehicles().values()) {
                    double newLatitude = vehicle.getCoordinate().getLatitude() + getRandomOffset();
                    double newLongitude = vehicle.getCoordinate().getLongitude() + getRandomOffset();
                    Coordinate newCoordinate = new Coordinate(newLatitude, newLongitude);
                    trackingSystem.updateVehiclePosition(vehicle.getName(), newCoordinate);
                }

                // Display vehicle positions
                displayVehiclePositions();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static double getRandomOffset() {
        Random random = new Random();
        return (random.nextDouble() - 0.5) / 100; // Generate random offset between -0.005 and 0.005
    }

    private static void displayVehiclePositions() {
        System.out.println("\nVehicle Positions:");
        for (Vehicle vehicle : trackingSystem.getAllVehicles().values()) {
            System.out.println("Vehicle: " + vehicle.getName());
        System.out.println("Latitude: " + vehicle.getCoordinate().getLatitude());
        System.out.println("Longitude: " + vehicle.getCoordinate().getLongitude());
        System.out.println("--------------------");
    }
}
        }