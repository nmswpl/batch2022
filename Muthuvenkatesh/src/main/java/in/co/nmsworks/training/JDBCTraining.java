package in.co.nmsworks.training;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.ArrayList;
//
//public class JDBCTraining {
//
//    private void select(){
//        try{
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
//            ArrayList<String> toDoList = new ArrayList<>();
//            String s1 = "INSERT INTO TODOLIST VALUES (1,'Muthu','Iron Clothes','2022-10-05 04:35:09')";
//            toDoList.add(s1);
//            s1 = "INSERT INTO TODOLIST VALUES (2,'Bala','Washing Clothes','2022-10-05 04:44:13')";
//            toDoList.add(s1);
//            s1 = "INSERT INTO TODOLIST VALUES (3,'Arjun','reading Book','2022-10-05 04:47:18')";
//            toDoList.add(s1);
//            s1 = "INSERT INTO TODOLIST VALUES (4,'Krishna','Do Homework','2022-10-05 04:50:25')";
//            toDoList.add(s1);
//            s1 = "INSERT INTO TODOLIST VALUES (5,'Kamal Hasan','Watch movie','2022-10-05 04:59:35')";
//            toDoList.add(s1);
//            for (String s : toDoList) {
//                PreparedStatement st = con.prepareStatement(s);
//                st.executeUpdate();
//            }
//           System.out.println("Connected");
//        }
//        catch(Exception e){
//            System.err.println("connection not obtained");
//            e.printStackTrace();
//
//        }
//    }
//    public static void main(String[] args) {
//        JDBCTraining jdbc = new JDBCTraining();
//        jdbc.select();
//    }
//}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCTraining {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement st = null;
        try {
            ArrayList<String[]> queries = new ArrayList<>();
            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            queries.add(new String[]{"Muthu", "Ironing Dress", "2022-10-06 04:35:09" });
            queries.add(new String[]{"Sanjeev", "Teaching Java", "2022-10-06 04:36:09" });
            queries.add(new String[]{"Vijay Kumar", "Teaching HTML", "2022-10-06 04:41:09" });
            queries.add(new String[]{"Anna Malai", "Reading Books", "2022-10-06 04:38:09" });
            queries.add(new String[]{"Kamal Haasan", "Host Bigg Boss", "2022-10-06 04:39:09" });
            queries.add(new String[]{"Shesha Hari", "Do Homework", "2022-10-06 04:37:09" });
            queries.add(new String[]{"Vignesh", "Washing Clothes", "2022-10-06 04:43:09" });
            queries.add(new String[]{"Arjunan", "Do Homework", "2022-10-06 04:45:09" });
            queries.add(new String[]{"Krishna", "Reading Books", "2022-10-06 04:47:09" });
            queries.add(new String[]{"Kamal Haasan", "Watching Vikram Movie", "2022-10-06 04:49:09" });
            st = con.prepareStatement("INSERT INTO TODOLIST VALUES (?, ?, ?, ?)");
            for (int i = 0; i < queries.size(); i++) {
                st.setInt(1, i + 1);
                st.setString(2, queries.get(i)[0]);
                st.setString(3, queries.get(i)[1]);
                st.setString(4, queries.get(i)[2]);
                st.executeUpdate();

            }

        } catch (SQLException e) {
            System.err.print("Exception");
            e.printStackTrace();
        }
        finally {
            try{
                if(st!=null)
                    st.close();
                if(con!=null)
                    con.close();
            }
            catch (SQLException e){
                System.err.println("finally exception");
            }
        }
    }
}
