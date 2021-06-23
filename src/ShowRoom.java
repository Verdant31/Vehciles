import java.util.ArrayList;

public class ShowRoom {
    public int id;
    public String data;
    public String expoName;
    public ArrayList<Vehicle> expoVList;
    public String expoLocal;

   


    public String getExpoLocal() {
        return this.expoLocal;
    }

    public void setExpoLocal(String expoLocal) {
        this.expoLocal = expoLocal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getExpoName() {
        return this.expoName;
    }

    public void setExpoName(String expoName) {
        this.expoName = expoName;
    }

    public ArrayList<Vehicle> getExpoVList() {
        return this.expoVList;
    }

    public void setExpoVList(ArrayList<Vehicle> expoVList) {
        this.expoVList = expoVList;
    }

    @Override
    public String toString() {
        return "\nId:" + id + "\nName: " + expoName + "\nDate: " + data + "\nLocal: " + expoLocal + "Vehicles list: " + expoVList;
    }

    
}
