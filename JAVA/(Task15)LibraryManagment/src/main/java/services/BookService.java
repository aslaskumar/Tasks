package services;

import model.Book;

import java.sql.SQLException;
import java.util.List;
public interface BookService {

//      static List<L_book_dtls> getBooks() throws SQLException;

       List<Book> getBooks();
       Book getBookById(int bookId);
       Book insertDetail(Book book);

       Book createBook(Book book);

       Book updateBook(Book book);
       Book deleteBook(Book book);
//       List<Book> sortBooks();
}
