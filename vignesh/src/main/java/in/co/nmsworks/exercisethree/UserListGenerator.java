package in.co.nmsworks.exercisethree;

import java.io.*;
import java.sql.*;


public class UserListGenerator {

    public static void generateList(File file,PreparedStatement statement) {

        try (
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fileWriter)){
                    String row;
                    ResultSet resultSet = statement.executeQuery();
                    while (resultSet.next()){
                        row  = (resultSet.getString(1)+ "   |   " + resultSet.getString(2) + "  |   " + resultSet.getString(3) + "  |   "+resultSet.getString(4) + "\n");
                        br.write(row);
                    }
            } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        File file = new File("/home/nmsadmin/Downloads/Writehere/male.txt");
        File file2 = new File("/home/nmsadmin/Downloads/Writehere/female.txt");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement statement = connection.prepareStatement("select user_id,username,first_name,last_name from user_details where gender = 'male';");
            PreparedStatement statement2 = connection.prepareStatement("select user_id,username,first_name,last_name from user_details where gender = 'female';")) {
            UserListGenerator.generateList(file,statement);
            UserListGenerator.generateList(file2,statement2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
