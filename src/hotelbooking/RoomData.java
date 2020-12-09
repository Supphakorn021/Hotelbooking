package hotelbooking;

import java.util.ArrayList;

/**
 *
 *  @author Supphakorn021
 */
public class RoomData {
//    String[] roomid = new String[10];
    private ArrayList<Room> room;// เป็น Attributes ของ ArrayList
    private int[] roomID = {101, 102, 103, 104, 105, 106, 107};//เป็น Attributes ที่เอาไว้เก็บข้อมูลของ ArrayList

    public RoomData() {//เป็น method ที่เอาไว้เก็บข้อมูลห้องที่เป็น Array
        room = new ArrayList<Room>();
        for (int i = 0; i < roomID.length; i++) {
            addRoom(new Room(roomID[i]));
        }
    }
    private void addRoom(Room addRoom) {//เป็น method ที่เอาไว้เพิ่มห้องใช้กับ RoomData แล้ว  return  ค่า
        room.add(addRoom);
    }

    public ArrayList<Room> getRoom() {//เป็น method ที่เป็นตัวเรียกห้องใน Array แล้ว return  ค่า
        return room;
    }
}
