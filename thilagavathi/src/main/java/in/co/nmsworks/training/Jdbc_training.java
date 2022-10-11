package in.co.nmsworks.training;

import java.sql.*;
import java.time.LocalDate;

public class Jdbc_training {
        public void readyMySql()
        {
            Connection connection =null;
            PreparedStatement preparedStatement=null;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost/Training");

                String[] query={"anu","swetha","moni","sridharan","shanthi","anusuya","vijayan","yashika","priya","subramani"};
                String q="insert into Todolist values(?,?,?,?)";

                preparedStatement = connection.prepareStatement(q);

                for (int i=0;i<query.length;i++)
                {
                    preparedStatement.setInt(1,i+1);
                    preparedStatement.setString(2,query[i]);
                    preparedStatement.setString(3,"doing some alloted work");
                    preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
                    int count = preparedStatement.executeUpdate();
                }
            }
            catch (Exception e)
            {
                System.err.println("Exception Accured");
                e.printStackTrace();
            }

            finally {
                try {
                    if (preparedStatement != null)
                    {
                        preparedStatement.close();
                    }
                    if(connection != null)
                    {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static void main(String[] args)
        {
            Jdbc_training jdbcExercise = new Jdbc_training();
            jdbcExercise.readyMySql();
        }
    }


