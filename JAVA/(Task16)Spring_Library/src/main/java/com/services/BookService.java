package com.services;

import com.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBook();

    List<Book> getBooks();
    Book getBookById(int bookId);
    String createBook(Book book);
    String updateBook(Book book);
    String deleteBook(Book book);
}
