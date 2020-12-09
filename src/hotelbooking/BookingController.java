package hotelbooking;

/**
 *
 *  @author Supphakorn021
 */
public class BookingController {

    private static RoomData roomdata = new RoomData(); // // ห้องที่จองใหม่ 

    public static RoomData getRoomdataAll() {//ข้อมูลของห้องทั้งหมด
        return roomdata;
    }

    public static Room getRoom(int roomid) {//เป็น method ที่เรียกห้องในหน้าเมนู
        for (Room r : roomdata.getRoom()) {
            if (r.getRoomid() == roomid) {
                return r;
            }
        }
        return null;
    }
}
