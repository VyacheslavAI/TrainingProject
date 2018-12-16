package servlets;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/ds")
public class DataSourceServlet extends HttpServlet {

    @Resource(name = "myDataSource")
    DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        try (Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement()) {

            statement.execute("drop table if exists student");
            statement.executeUpdate("create table if not exists student (id mediumint not null auto_increment, name char(30) not null, primary key (id))");
            statement.executeUpdate("insert into student (name) values ('meow')");

        } catch (SQLException e) {
        }
    }
}
