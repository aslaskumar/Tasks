package Library;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class Connection1 {

    public static Connection getConnect() {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libraryapp", "root", "Pramati123.");
            statement=connection.createStatement();

        } catch (ClassNotFoundException var2) {
            var2.printStackTrace();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
        return connection;

    }

}
