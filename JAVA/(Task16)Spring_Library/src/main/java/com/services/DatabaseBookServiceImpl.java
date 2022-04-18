package com.services;

import com.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("data")
public class DatabaseBookServiceImpl implements BookService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getBook() {
        Session session=sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        List<Book> books=session.createQuery("from Book", Book.class).list();
        transaction.commit();
        session.close();
        return books;
    }

    @Override
    public List<Book> getBooks() {
        return null;
    }

    @Override
    public Book getBookById(int bookId) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Book book=session.get(Book.class,bookId);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public String createBook(Book book) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(book);
        try {
            transaction.commit();
        }
        catch (Exception e){
            return "Cannot add the record";
        }
        session.close();
        return "Successfully added";
    }

    @Override
    public String updateBook(Book book) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(book);
        try {
            transaction.commit();
        }
        catch (Exception e){
            return "Cannot update the record";
        }
        session.close();
        return "updated Successfully";
    }

    @Override
    public String deleteBook(Book book) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(book);
        try {
            transaction.commit();
        }
        catch (Exception e){
            return "Cannot delete the record";
        }
        session.close();
        return "deleted successfully";
    }
}
