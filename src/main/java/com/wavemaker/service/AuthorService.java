package com.wavemaker.service;

import com.wavemaker.dao.AuthorDao;
import com.wavemaker.daoImpl.AuthorDaoImpl;
import com.wavemaker.model.AuthorDetails;
import com.wavemaker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorDao authorDaoImpl;

    public void addAuthorDetails(AuthorDetails authorDetails) {
        authorDaoImpl.addAuthor(authorDetails);
    }

    public void deleteAuthorDetails(int authorId) {
        authorDaoImpl.deleteAuthorById(authorId);
    }

    public void updateAuthorDetails(AuthorDetails authorDetails) {
        authorDaoImpl.updateAuthor(authorDetails);
    }

    public List<AuthorDetails> getAllAuthorsDetails() {
        return authorDaoImpl.getAllAuthors();
    }

    public AuthorDetails getAuthorDetailsById(int authorId) {
        return authorDaoImpl.getAuthorById(authorId);
    }

    public List<Book> getBooksByAuthorId(int authorId) {
        return authorDaoImpl.getBooksByAuthorId(authorId);
    }
}
