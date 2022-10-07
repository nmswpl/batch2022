package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTraining {

    private void select()
    {
        Connection con = DriverManager.getConnection("JDBC");
    }
    public static void main(String[] args) {
        JdbcTraining jdbc = new JdbcTraining();
    }
}
