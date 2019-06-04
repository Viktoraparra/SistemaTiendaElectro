package org.lab.services;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.lab.connector.ConnectorMySQL;
import org.lab.entities.Llave;
import org.lab.repositories.jdbc.LlaveR;

public class ServicioLlaveSave implements Runnable{
    private int port=8001;
    private LlaveR ll = new LlaveR(ConnectorMySQL.getConnection());

    @Override
    public void run() {
        try (ServerSocket ss=new ServerSocket(port)) {
            System.out.println("Servicio Llave Save: OK");
            while(true){
                System.out.println("Esperando conexión de cliente...");
                try (
                        Socket so=ss.accept();
                        ObjectInputStream in=new ObjectInputStream(so.getInputStream());
                        ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
                ){
                    System.out.println("Servicio Llave save, se conecto "+so.getInetAddress());
                    try {
                        Llave llave=(Llave)in.readObject();
                        ll.save(llave);
                        System.out.println(llave);
                        out.writeObject(llave.getNombre()+"");
                    } catch (Exception eee) {
                        System.out.println(eee);
                        out.writeObject("0");
                    }
                } catch (Exception ee) { ee.printStackTrace(); }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
