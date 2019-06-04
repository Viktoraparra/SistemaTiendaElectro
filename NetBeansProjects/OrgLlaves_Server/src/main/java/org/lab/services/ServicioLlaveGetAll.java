package org.lab.services;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.lab.connector.ConnectorMySQL;
import org.lab.repositories.jdbc.LlaveR;

public class ServicioLlaveGetAll implements Runnable{
    private int port=8003;
    private LlaveR ll= new LlaveR(ConnectorMySQL.getConnection());

    @Override
    public void run() {
        try (ServerSocket ss=new ServerSocket(port)) {
            System.out.println("Servicio Llave getAll: OK");
            while(true){
                System.out.println("Esperando conexión de cliente...");
                try (
                        Socket so=ss.accept();
                        ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
                ){
                    System.out.println("Servicio Llave getAll, se conecto "+so.getInetAddress());
                    out.writeObject(ll.getAll());
                } catch (Exception ee) { ee.printStackTrace(); }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
    
}
