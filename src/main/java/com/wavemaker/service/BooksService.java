package com.wavemaker.service;

import com.wavemaker.dao.BooksDao;
import com.wavemaker.daoImpl.BooksDaoImpl;
import com.wavemaker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    private BooksDao booksDaoImpl;

    public String addBooks(Book book) {
        System.out.println(book);
        return booksDaoImpl.insert(book);
    }

    public String deleteBooks(int bookId) {
        return booksDaoImpl.delete(bookId);
    }

    public String updateBooks(Book book) {
        return booksDaoImpl.update(book);
    }

    public List<Book> getALlBooks() {
        return booksDaoImpl.getAllBooks();
    }

    public Book getBookById(int bookId) {
        return booksDaoImpl.getBookById(bookId);
    }

}
