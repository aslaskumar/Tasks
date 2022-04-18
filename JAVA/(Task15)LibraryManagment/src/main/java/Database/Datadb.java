package Database;


import model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datadb {
    private  static Logger logger= LoggerFactory.getLogger(Datadb.class);

    public static Connection con = null;
    public static Statement stm = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_ MS", "root", "Pramati123.");
            logger.info("Connection Object "+con.toString());
            stm = con.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;

    }
    public static ResultSet getBook() throws SQLException {
        ResultSet resultSet= stm.executeQuery("select * from L_book_dtls");
        return resultSet;
    }
//
//    public static ResultSet getResult() throws SQLException {
//        ResultSet rs = stm.executeQuery("select * from journey ");
//        return rs;
//    }
//    public static ResultSet getFlightResult() throws SQLException{
//        ResultSet resultSet = stm.executeQuery("select * from flight ");
//        return resultSet;
//    }
//    public static void insertJourney(Journey journey)  {
//        try {
//            con = getConnection();
//            logger.info("welcome to insert");
//            PreparedStatement preparedStatement = con.prepareStatement("insert into journey values(?,?,?)");
//            preparedStatement.setInt(1, journey.getJourneyId());
//            preparedStatement.setString(2, journey.getStartPlace());
//            preparedStatement.setString(3, journey.getDestination());
//
//            preparedStatement.executeUpdate();
//
//            logger.info("sql executed");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public static <journey> void updateJourney(Journey journey){
//        try {
//            con = getConnection();
//            PreparedStatement preparedStatement = con.prepareStatement("update journey set start_place=?,destination=? where journey_id="+journey.getJourneyId());
//            preparedStatement.setString(1, journey.getStartPlace());
//            preparedStatement.setString(2, journey.getDestination());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void deleteJourney(Journey journey ) {
//        try {
//            con = getConnection();
//            PreparedStatement preparedStatement = con.prepareStatement("delete from journey where journey_id=" + journey.getJourneyId());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    /*public static List<Book> getBooksList(){

        List<Book> l_book_dtlsList=new ArrayList<>();
        try{
            con=getConnection();
            ResultSet resultSet=con.createStatement().executeQuery("select * from L_book_dtls");
            while(resultSet.next()){
                Book l_book_dtls=new Book();
                l_book_dtls.setCode(resultSet.getString(1));
                l_book_dtls.setCategory(resultSet.getString(2));
                l_book_dtls.setAuthor(resultSet.getString(3));
                l_book_dtls.setPrice(resultSet.getInt(4));
                l_book_dtls.setSup_id(resultSet.getInt(5));
                l_book_dtlsList.add(l_book_dtls);
            }
            return l_book_dtlsList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }*/
}
