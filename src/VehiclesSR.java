import java.util.ArrayList;

public class VehiclesSR {
    private static ArrayList<Vehicle> VehiclesSRList = new ArrayList<>();

    public static void addShowRom(Vehicle v) {
        VehiclesSRList.add(v);
    }

    public static Vehicle getVehiclesSR(int id) {
        for(Vehicle temp: VehiclesSRList) {
            if(temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesSRList() {
        return VehiclesSRList;
    }
   
}
