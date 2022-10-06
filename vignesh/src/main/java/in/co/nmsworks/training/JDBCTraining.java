package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;

public class JDBCTraining {
    private static void insert (Connection con, ArrayList<String> sqlCommands) throws SQLException {
        for (String sqlCommand : sqlCommands){
            PreparedStatement statement = con.prepareStatement(sqlCommand);
            statement.executeUpdate();
        }

    }

    private static  void insertDatabase(Connection con,int rowNumber,String uname,String desc,String dateTime) throws SQLException {

        String sqlCommand = "insert into TodoList values("+rowNumber+","+ "\'" +uname+"\'"+","+"\'"+desc+"\'"+","+"\'"+dateTime+"\'"+")";
        System.out.println(sqlCommand);
        PreparedStatement statement = con.prepareStatement(sqlCommand);
        statement.executeUpdate();


    }
    public static void main(String[] args) {

        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/Training");
//            String cmd1 = "insert into TodoList  values(1,'Victor','Eat Dinner','2022-10-06 18:00:01') ";
//            String cmd2 = "insert into TodoList  values(2,'Vijay','Lunch','2022-10-06 18:00:01') ";
//            String cmd3 = "insert into TodoList  values(3,'Shakti','Snacks','2022-10-06 18:00:01') ";
//            String cmd4 = "insert into TodoList  values(4,'Someone','Breakfast','2022-10-06 18:00:01') ";
//            String cmd5 = "insert into TodoList  values(5,'Something','Cricket','2022-10-06 18:00:01') ";
//            ArrayList<String> arrayList = new ArrayList<>();
//            arrayList.add(cmd1);
//            arrayList.add(cmd2);
//            arrayList.add(cmd3);
//            arrayList.add(cmd4);
//            arrayList.add(cmd5);
////            insert(con,arrayList);
            insertDatabase(con,1,"Victor","Dinner","2022-10-06 18:00:01");
            insertDatabase(con,2,"Alice","Volleyball","2022-10-06 20:00:01");
            insertDatabase(con,3,"Emy","Billiards","2022-10-06 23:00:01");
            insertDatabase(con,4,"Ishu","Breakfast","2022-10-06 08:00:01");
            insertDatabase(con,5,"Xziya","Dinner","2022-10-06 18:00:01");
        } catch (SQLException e) {
           e.printStackTrace();
        }
//        JDBCTraining jdbcTraining = new JDBCTraining();
    }

}
