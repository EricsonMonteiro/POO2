package SPRINT_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BaseDados {
    private static final String user = "ericson";
    private static final String password = "monteiro";
    private static String url = "jdbc:mysql://172.16.0.32:3306/Pedrada";

    public static Connection getConnection() {
        Connection aux = null;
        try {
            aux = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão BD ok");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar" + "ao banco de dados:" + e.getMessage());
        }
        return aux;

    }


}