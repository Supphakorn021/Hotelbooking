package hotelbooking;

import java.util.Scanner;

/**
 *
 *  @author Supphakorn021
 */
public class App {

    private static BookingController bc = new BookingController(); // ดึง method จาก  class BookingProcess
    private static Scanner scn = new Scanner(System.in); // นำเข้าข้อมูลการพิมพ์
    private static int selecter;//กำหนด selecter
    private static Room rm = null; //  ดึง method จาก class Room 

    private static int manageRoom() { // คือ code ที่ใช้สำหรับหน้า menu
        int state = 0;
        System.out.println("Choose the room");
        for (Room room : bc.getRoomdataAll().getRoom()) {
            System.out.println(room.toString());
        }
        System.out.print("Enter room number or 0 to back : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println("\n");
        if (roomid == 0) {
            state = 0;
        } else {
            if (BookingController.getRoom(roomid) == null) {
                System.out.println("Enter wrong number : ".toUpperCase() + roomid);
                state = 1;
            } else {
                rm = bc.getRoom(roomid);
                if (!rm.isBooked()) {
                    System.out.println("Your room is: " + rm.getRoomid());
                    System.out.println("Checkin successfully !!");
                    rm.setBooked(true);
                    state = 1;
                } else {
            if (bc.getRoom(roomid) == null) {
            } else { 
                rm = bc.getRoom(roomid);
                if (rm.isBooked()) {
                    System.out.println("Your room is: " + rm.getRoomid());
                    System.out.println("Checkout successfully !!");
                    rm.setBooked(false);
                    state = 1;
        }
        }
        }
        }
        }   return state;
        }
    public static void main(String[] args) {
        //ตัวหน้าเมนู
        do {
            String menuStr = "1. Checkin or Checkout room \n"
                    + "0. exit";
            System.out.println(menuStr);
            System.out.print("Select menu : ");
            selecter = scn.nextInt();
            scn.nextLine();
            switch (selecter) {
                case 1: {
                    boolean exited;
                    do {
                        int state = manageRoom();
                        exited = (state != 0);
                        switch (state) {
                            case 0:
                                break;
                        }
                    } while (exited);
        }
        } 
        }   while (selecter != 0); 
        }
        }
