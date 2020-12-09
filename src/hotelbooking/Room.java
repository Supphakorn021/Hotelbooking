package hotelbooking;

/**
 *
 *  @author Supphakorn021
 */
public class Room {

    private int roomid;// เป็น Attributes ที่ไว้เก็บเลขห้อง
    private boolean booked = false;// เป็น Attributes ที่กำหนดค่าว่าจองหรือยังไม่จองโดยกำหนดค่าไว้คือยังไม่จอง

    public Room(int roomid) {//เป็น Constructor
        this.roomid = roomid;
    }

    public int getRoomid() {//เป็น method ที่เป็นตัวเรียกห้องและในไปใช้กับ getRoom แล้ว return  ค่า
        return roomid;
    }

    public boolean isBooked() {//เป็น method ที่กำหนดค่าการจองห้อง
        return booked;
    }
    
    public void setBooked(boolean booked) {//เป็น method ที่ไว้เก็บค่าจากการจองห้อง
        this.booked = booked;
    }

    @Override
    public String toString() {//เป็น toString ที่เอาไว้แสดงผลในหน้า App
        String status = (booked) ? "Booked" : "Free";
        return "Room " + roomid + " Booking Status : " + status;
    }
}
