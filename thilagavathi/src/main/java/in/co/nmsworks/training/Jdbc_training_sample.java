package in.co.nmsworks.training;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jdbc_training_sample {
    private void update() {

        Connection con = null;
        PreparedStatement p = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            List<String[]> list = new ArrayList<>();

            list.add(new String[]{"swetha", "Female"});
            list.add(new String[]{"sathya", "Female"});
            list.add(new String[]{"charu", "Female"});
            list.add(new String[]{"vanitha", "Female"});
            list.add(new String[]{"vinoth", "Male"});
            list.add(new String[]{"deva", "Male"});

            String query = "insert into Todolist values(?,?,?,?,?,?)";
            p = con.prepareStatement(query);

            for (int i = 0; i < list.size(); i++) {
                p.setInt(1, i + 1);
                p.setString(2, list.get(i)[0]);
                p.setInt(3, 12345);
                p.setInt(4, 111);
                p.setString(5, list.get(i)[1]);
                p.setString(6, "doing work");
                p.setDate(8, Date.valueOf(LocalDate.now()));

                p.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


        public static void main (String[]args){
            Jdbc_training_sample sample = new Jdbc_training_sample();
            sample.update();
        }
    }






