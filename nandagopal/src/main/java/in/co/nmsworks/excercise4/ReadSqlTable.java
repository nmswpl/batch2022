package in.co.nmsworks.excercise4;
// 1. Select gender 'male' from sql table,
// 2. write output of 1 to new file male.txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ReadSqlTable {
    public static Map<Integer, Map<String, Object>> getResultSetFromTable(Connection conn, String query) throws Exception {
        Map<Integer, Map<String, Object>> idToMapOfValues = new HashMap<>();

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> columnToValue = new HashMap<>();
                columnToValue.put("userName", rs.getString(2));
                columnToValue.put("firstName", rs.getString(3));
                columnToValue.put("lastName", rs.getString(4));

                idToMapOfValues.put(rs.getInt(1), columnToValue);
            }
        }
        return idToMapOfValues;
    }
    public static void writeFile(Map<Integer, Map<String, Object>> idToMapOfValues, String filePath) throws Exception {
        try (FileWriter fw = new FileWriter(filePath);
             BufferedWriter bw = new BufferedWriter(fw)) {

            for(Integer id : idToMapOfValues.keySet()) {
                String line = "";
                line += idToMapOfValues.get(id).get("userName") + ", ";
                line += idToMapOfValues.get(id).get("firstName") + ", ";
                line += idToMapOfValues.get(id).get("lastName");

                bw.write(line);
                bw.newLine();
            }
        }
    }

    public static void main(String[] args) {
        String maleFilePath = "/home/nmsadmin/Desktop/Training/assetFiles/male_details.txt";
        String femaleFilePath = "/home/nmsadmin/Desktop/Training/assetFiles/female_details.txt";

        String selectMaleQuery = "select * from user_details where gender = 'Male'";
        String selectFemaleQuery = "select * from user_details where gender = 'Female'";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training")){
            Map<Integer, Map<String, Object>> maleIdToDetails = getResultSetFromTable(conn, selectMaleQuery);
            writeFile(maleIdToDetails, maleFilePath);

            Map<Integer, Map<String, Object>> femaleIdToDetails = getResultSetFromTable(conn, selectFemaleQuery);
            writeFile(femaleIdToDetails, femaleFilePath);

            System.out.println("success");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("cannot make connection to database");
        }
    }
}
