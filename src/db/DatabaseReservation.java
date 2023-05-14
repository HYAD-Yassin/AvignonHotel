package db;

import mode.Customer;

import java.util.ArrayList;
import java.util.UUID;

public class DatabaseReservation {

    public static ArrayList<Customer> customerTable = new ArrayList<Customer>();


    static {
        customerTable.add(
                new Customer("HYAD Yassin","971236454V","0776343456","yassin.hyad@gmail.com"," 05 COLOMBO","ROOM01")
        );
        customerTable.add(
                new Customer("SUGATH VISAL","912346454V","0776667546","sugath@gmail.com"," 04 PANADURA","ROOM02")
        );
        customerTable.add(
                new Customer("KALANA PERERA","954321454V","0776127575","kalana@gmail.com"," 03 NEGOMBO","ROOM03")
        );
        customerTable.add(
                new Customer("NIMAL SIRIPALA","876546454V","0773554562","nimal@gmail.com"," 02 GAMPAHA","ROOM04")
        );
        customerTable.add(
                new Customer("Tinsalhi Cylia","834536454V","0714562310","chandana@gmail.com"," 01 COLOMBO","ROOM05")
        );


        for (int i = 0; i < 10000 ; i++) {
            String id = UUID.randomUUID().toString(); // generate a random UUID for each client
            String name = "Client " + i;
            String tpNum = "TP-" + i;
            String email = "client" + i + "@example.com";
            String address = "Address " + i;
            String roomNum = "Room " + i;
            customerTable.add(new Customer(name,id,tpNum,email,address,roomNum));
        }

    }

    }





