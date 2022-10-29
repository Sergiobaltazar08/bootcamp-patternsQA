package SingletonSQL;

import java.sql.Connection;

class MainSingletonSQL {
    public static void main(String args[]){
        Connection cliente = sqlDBClient.getConnection();
    }
}

