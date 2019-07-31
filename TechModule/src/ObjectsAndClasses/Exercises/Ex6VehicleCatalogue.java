package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex6VehicleCatalogue {
    public static class Vehicle {
        String Type;
        String Model;
        String Color;
        int Horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            Type = type;
            Model = model;
            Color = color;
            Horsepower = horsepower;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public String getModel() {
            return Model;
        }

        public void setModel(String model) {
            Model = model;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String color) {
            Color = color;
        }

        public int getHorsepower() {
            return Horsepower;
        }

        public void setHorsepower(int horsepower) {
            Horsepower = horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\n" +
                            "Model: %s\n" +
                            "Color: %s\n" +
                            "Horsepower: %d"
                    , this.getType().toUpperCase().charAt(0) + this.getType().substring(1)
                    , this.getModel(), this.getColor(), this.getHorsepower());
        }
    }

    public static double averageCars(List<Vehicle> vehicles) {
        if (vehicles.size()==0){
            return 0.0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum()/vehicles.size();
    }
    public static double averageTrucks(List<Vehicle> vehicles) {
        if (vehicles.size()==0){
            return 0.0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum()/vehicles.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> allVehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            allVehicles.add(vehicle);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String name = input;
            allVehicles.stream().filter(e -> e.getModel().equals(name)).forEach(System.out::println);
            input = scanner.nextLine();
        }

        System.out.println(String.format("Cars have average horsepower of: %.2f."
                , averageCars( allVehicles.stream().filter(e -> e.getType().equals("car")).collect(Collectors.toList()))));

        System.out.println(String.format("Trucks have average horsepower of: %.2f."
                , averageCars( allVehicles.stream().filter(e -> e.getType().equals("truck")).collect(Collectors.toList()))));
    }
}
