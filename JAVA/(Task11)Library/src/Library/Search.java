

package Library;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Search {
    public Search() {
    }

    public void Search() throws Exception {

        Connection connection = Connection1.getConnect();;

        Scanner scanner = new Scanner(System.in);
        Statement st = connection.createStatement();
        System.out.println("Enter Book name");
        String bn = scanner.next();
        String sql = "select * from Books where book_name = '" + bn + "'";
        ResultSet rs = st.executeQuery(sql);
        if (rs == null) {
            System.out.println(" Not found");
        }

        while(rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString("book_name"));
        }

        rs.close();
        st.close();
        connection.close();
    }
}
