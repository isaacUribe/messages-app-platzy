package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conection conection = new Conection();
        try (Connection cnx = conection.get_connection()){

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}