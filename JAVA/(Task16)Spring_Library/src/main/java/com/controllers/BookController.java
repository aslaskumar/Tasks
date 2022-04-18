package com.controllers;

import com.model.Book;
import com.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/book")
public class BookController<reminder> {

    @Autowired
    @Qualifier("data")
    private BookService bookService;

    @RequestMapping(value = "/getBooks",method = RequestMethod.GET)
    public List<Book> getBook(){
        return bookService.getBooks();
    }

    @RequestMapping(value = "/getBookById/{id}",method = RequestMethod.GET)
    public Book getBookById(@PathVariable(name = "id") int bookId){
        return bookService.getBookById(bookId);
    }

    @RequestMapping(value = "/add book",consumes = "application/json",produces = "application/json",method = RequestMethod.POST)
    public String createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @RequestMapping(value = "/update book",method = RequestMethod.PUT)
    public String updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "delete book",method = RequestMethod.DELETE)
    public String deleteBook(@RequestBody Book book){
        return bookService.deleteBook(book);
    }

}
