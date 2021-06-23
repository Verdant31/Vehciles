import java.util.ArrayList;

public class VehicleList {
    private static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public static void addVehicle(Vehicle v) {
        vehicleList.add(v);
    }

    public static Vehicle getVehicle(int id) {
        for(Vehicle temp: vehicleList) {
            if(temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }

    public static ArrayList<Vehicle> getVehicles() {
        return vehicleList;
    }

    public static void removeVehicle(Vehicle v) {
        vehicleList.remove(v);
    }
}