import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {




        String url = "jdbc:mysql://localhost:3306/Testing?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String userName = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");

        long time = new Date().getTime();
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            PreparedStatement statement = connection.prepareStatement("select * from person where id = ?");
            for (int i = 0; i < 1000; i++) {
//                statement.execute("select * from person where id = " + i);
                statement.setInt(1, i);
                statement.executeQuery();
            }
        }

        System.out.println(new Date().getTime() - time);


//        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
//
//            PreparedStatement statement = connection.prepareStatement("insert into person values(?, 'Max', ?)");
//
//            for (int i = 0; i < 100_000; i++) {
//                statement.setInt(1, i);
//                statement.setInt(2, i);
//
//                statement.executeUpdate();
//            }
//        }
//
    }
}
