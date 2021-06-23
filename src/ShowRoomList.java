import java.util.ArrayList;

public class ShowRoomList {
    private static ArrayList<ShowRoom> showRoomList = new ArrayList<>();

    public static void addShowRom(ShowRoom s) {
        showRoomList.add(s);
    }

    public static ShowRoom getShowRoom(int id) {
        for(ShowRoom temp: showRoomList) {
            if(temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }

    public static ArrayList<ShowRoom> getShowRooms() {
        return showRoomList;
    }

    public static void removeShowRoom(ShowRoom s) {
        showRoomList.remove(s);
    }
}
