package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    public Connection get_connection (){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "");
            if (connection != null){
                System.out.println("conexion exitosa");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
