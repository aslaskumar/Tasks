

package Library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display {


    public static void Display() throws Exception {
        Connection connection = null;
        connection=Connection1.getConnect();
        Statement st = connection.createStatement();
        String sql = "select * from Books";
        st.executeQuery(sql);
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }

    }
}
