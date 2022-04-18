package services;

import Database.Datadb;
import model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*import static Database.Datadb.getBooksList;*/

public class BookServiceImpl implements BookService{
    List<Book> books=new ArrayList<>();
    Connection connection=null;
    Datadb db=new Datadb();
    @Override
    public List<Book> getBooks()  {
        try {
            ResultSet resultSet=Datadb.getBook();

            while (resultSet.next()){
                Book book=new Book();
                book.setCode(resultSet.getString(1));
                book.setAuthor(resultSet.getString(2));
                book.setCategory(resultSet.getString(3));
                book.setPrice(resultSet.getInt(4));
                book.setsupplierId(resultSet.getInt(5));
                books.add(book);
            }
            return books;

        }catch (Exception e){
            return null;
        }

    }

    @Override
    public Book getBookById(int bookId) {
        return null;
    }

    @Override
    public Book insertDetail(Book book) {
        return null;
    }

    @Override
    public Book createBook(Book book) {

        return null;
    }

    @Override
    public Book updateBook(Book book) {
        updateBook(book);
        return null;
    }

    @Override
    public Book deleteBook(Book book) {
        deleteBook(book);
        return null;
    }

//    @Override
//    public List<Book> sortBooks() {
//        return null;
//    }
}
