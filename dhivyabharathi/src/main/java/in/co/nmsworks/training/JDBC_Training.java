package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Jdbc_training {

    public void insert()
    {
        Connection c = new Driver("") {
            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }
        };
    }

    public static void main(String[] args) {
        Jdbc_training jdbcTraining = new Jdbc_training();
        jdbcTraining.insert();
    }
}
