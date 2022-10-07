package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PreparedStatement stmt = null;
        Connection con = null;
        {
            try {
                System.out.println("Enter your name : ");
                String name = inp.nextLine();

                System.out.print("Enter first number :");
                int a = inp.nextInt();

                System.out.print("Enter second number :");
                int b = inp.nextInt();

                int sum = a + b;


                con = DriverManager.getConnection("jdbc:mysql://localhost/training");
                stmt = con.prepareStatement("insert into addition values(?,?,?,?)");
                stmt.setString(1,name);
                stmt.setInt(2,a);
                stmt.setInt(3,b);
                stmt.setInt(4,sum);

                stmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Error occured");
            }
        }
    }
}

