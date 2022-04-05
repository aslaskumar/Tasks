package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    public Delete() {
    }

    public void delete() throws Exception {
        Connection connection = null;
        connection=Connection1.getConnect();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Delete Record\n2.Clear table");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter Book name");
            String bn = sc.next();
            Statement st = connection.createStatement();
            String sql = "delete from Books where book_name = '" + bn + "'";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            Display.Display();
            connection.close();
            st.close();
        } else if (ch == 2) {
            Statement st = connection.createStatement();
            String sql = "truncate table Books";
            System.out.println(sql);
            st.executeUpdate(sql);
            st.close();
            connection.close();
        } else {
            System.out.println("Wrong Choice");
        }

    }
}
