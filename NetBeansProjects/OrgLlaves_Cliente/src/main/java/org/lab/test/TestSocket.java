package org.lab.test;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.lab.entities.Llave;
import org.lab.repositories.socket.LlaveR;

public class TestSocket {
    public static void main(String[] args) {
        String host="localhost";
        List<Integer>ports=new ArrayList();
        ports.add(8001);
        ports.add(8002);
        ports.add(8003);
        ports.add(8004);
        
        LlaveR ll = new LlaveR(host, ports);
        Calendar calendar = Calendar.getInstance();
        java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
        Llave llave = new Llave("Llave","Usuario",date);
        
        ll.save(llave);
        
        ll.getAll().forEach(System.out::println);
    }
}
