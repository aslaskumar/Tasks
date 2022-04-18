package Servlets;

import services.BookService;
import services.BookServiceImpl;
import model.Book;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class LibraryServlets extends HttpServlet {
    private static final Gson GSON = new GsonBuilder().create();
    private static final BookService bookService = new BookServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        if (req.getPathInfo() == null) {
            List<Book> books = bookService.getBooks();
            res.setStatus(200);
            res.setHeader("Content-Type:", "application/json");
            res.getOutputStream().println(GSON.toJson(books));
        }
    }

//        @Override
    protected void dopost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Book book = GSON.fromJson(req.getReader(), Book.class);
        bookService.insertDetail(book);
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Book book = GSON.fromJson(req.getReader(), Book.class);
//        BookService.update(book);

        res.setStatus(200);
        res.setHeader("Content-Type", "application/json");
        res.getOutputStream().println(GSON.toJson(book));
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Book book =GSON.fromJson(req.getReader(),Book.class);
//        BookService.delete(book);

        res.setStatus(200);
        res.setHeader("Content-Type","application/json");
        res.getOutputStream().println(GSON.toJson(book));
    }




}