package db;

import mode.Customer;
import mode.Rooms;

import java.util.ArrayList;
import java.util.UUID;

public class Database {
    public static ArrayList<Rooms> roomsTable=new ArrayList<Rooms>();


    static {
        roomsTable.add(
          new Rooms("ROOM01","SINGLE","970063439V","HYAD Yassin","17/11/2023","3.00PM")
        );
        roomsTable.add(
                new Rooms("ROOM02","TRIPLE","660541139V","Damith Dilshan","06/10/2021","2.00PM")
        );
        roomsTable.add(
                new Rooms("ROOM03","TRIPLE","595563439V","Wishal Perera","11/02/2023","9.00AM")
        );

        roomsTable.add(
                new Rooms("ROOM04","SINGLE","200063439V","Ishan Anuradha","21/05/2021","6.00PM")
        );
        roomsTable.add(
                new Rooms("ROOM05","DOUBLE","915663439V","TINSALHI Cylia","30/01/2022","4.00AM")
        );

        for (int i = 0; i < 10000 ; i++) {
            String id = UUID.randomUUID().toString(); // generate a random UUID for each client
            String roomNO = "ROOM " + i;
            String roomTYPE = "TRIPLE";
            String name = "Client " + i;
            String date = "17/01/2021 ";
            String time = "3."+i + "AM";
            roomsTable.add(new Rooms(roomNO,roomTYPE,id,name,date,time));
        }
    }

}
