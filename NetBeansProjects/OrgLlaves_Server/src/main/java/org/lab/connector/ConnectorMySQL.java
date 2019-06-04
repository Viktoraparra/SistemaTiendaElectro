package org.lab.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorMySQL {
     // declaro las Variables para establecer la conexion 
     private static String driver="com.mysql.cj.jdbc.Driver";
     private static String url="jdbc:mysql://localhost:3306/tengo_llave"+"?useTimezone=true&serverTimezone=UTC";
     private static String user="******";
     private static String pass="*****";
     private static Connection conn=null;
     
     // elaboro la funcion que realizara la conecxion
    // determinando que haga las verificaciones para establecer
    // una conexion unica a la base de dato 
    // continua e intermitente
         
    public synchronized static Connection getConnection(){
        if (conn==null) {
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
            } catch (Exception ex) { ex.printStackTrace(); }
        }
        return conn;
    }
}
