package com.wavemaker.controller;

import com.wavemaker.model.Book;
import com.wavemaker.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BooksService booksService;

    @PostMapping
    public String addBooks(@RequestBody Book book) {
        return booksService.addBooks(book);
    }

    @DeleteMapping("/{bookId}")
    public String deleteBooks(@PathVariable("bookId") int bookId) {
        return booksService.deleteBooks(bookId);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        booksService.updateBooks(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksService.getALlBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId) {
        return booksService.getBookById(bookId);
    }

//    @GetMapping("/test/{id}")
//    public List<Books> test(@PathVariable("id") int id){
//        return booksService.test(id);
//    }
}
