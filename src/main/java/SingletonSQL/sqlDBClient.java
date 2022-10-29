package SingletonSQL;

import java.sql.*;

public class sqlDBClient {

    //Propiedades
    private static Connection cliente = null;

    private String driver;
    private String url;
    private String usuario;
    private String password;

    //Constructor
    private sqlDBClient()
    {
        String url = "jdbc:mysql://localhost:3306/test";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "usuario";
        String password = "password";
        try{
            Class.forName(driver);
            cliente = DriverManager.getConnection(url, usuario, password);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {

        if (cliente == null) {
            System.out.println("Primera vez");
            new sqlDBClient();
        }

        return cliente;
    }
}


