package ee;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.*;

public class Main {

    static String userName = "root";
    static String password = "root";
    static String connectionUrl = "jdbc:mysql://localhost:3306/Testing?relaxAutoCommit=true";

    public static void main(String[] args) throws SQLException, ParserConfigurationException, ClassNotFoundException, IOException, InterruptedException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = connection.createStatement();

            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            statement.executeUpdate("drop table if exists books");

            statement.executeUpdate("create table books(id mediumint not null auto_increment, name char(30) not null, " +
                    " primary key(id))");

            statement.executeUpdate("insert into books (name) values ('firstbook')");
            connection.commit();
//            statement.addBatch("insert into books (name) values ('secondbook')");
//            statement.addBatch("insert into books (name) values ('thirdbook')");

            ResultSet resultSet1 = statement.executeQuery("select count(*) from books");
            while(resultSet1.next())
                System.out.println(resultSet1.getInt(1));

            new OtherThread().start();
            Thread.sleep(3000);

            ResultSet resultSet2 = statement.executeQuery("select count(*) from books");
            while(resultSet2.next())
                System.out.println(resultSet2.getInt(1));

            System.out.println("mainThread end");

        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
        }
    }

    static class OtherThread extends Thread {
        @Override
        public void run() {
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
                 Statement statement = connection.createStatement()) {
                connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

                statement.executeUpdate("insert into books (name) values ('somebook')");
                System.out.println("otherThread end");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}