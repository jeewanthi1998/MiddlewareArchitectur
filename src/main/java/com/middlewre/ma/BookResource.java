package com.middlewre.ma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @PostMapping("/books/{bookId}")
    public Book retreiveBook(@PathVariable int bookId){
        return bookService.findBook(bookId);
    }

    @PostMapping("/books")  // to input data
    public void createBook(@RequestBody Book book){
        Book saveBook = bookService.addBook(book); //saveBook - newly created book
    }





}
