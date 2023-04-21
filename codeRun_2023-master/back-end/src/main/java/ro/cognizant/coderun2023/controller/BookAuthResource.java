package ro.cognizant.coderun2023.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.cognizant.coderun2023.model.BookAuth;
import ro.cognizant.coderun2023.service.BookAuthService;

import java.util.List;

@RestController
@RequestMapping("/BooksList")
public class BookAuthResource {

    private final BookAuthService bookAuthService;

    public BookAuthResource(BookAuthService bookAuthService)
    {
        this.bookAuthService=bookAuthService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<BookAuth>> getAllBooks()
    {
        List<BookAuth> bookAuths=bookAuthService.books();
        return new ResponseEntity<>(bookAuths, HttpStatus.OK);
    }
    @PostMapping("/books")
    public  ResponseEntity<BookAuth> addBooks(@RequestBody BookAuth bookAuth)
    {
        BookAuth newBookAuth=bookAuthService.addBooks(bookAuth);
        return new ResponseEntity<>(newBookAuth,HttpStatus.CREATED);
    }

    @GetMapping("/update")
    public ResponseEntity<BookAuth> updateBookAuth(@RequestBody BookAuth bookAuth)
    {
        BookAuth updateBookAuth=bookAuthService.updateBook(bookAuth);
        return new ResponseEntity<>(updateBookAuth,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBookAuth(@PathVariable("id") Long id)
    {
        bookAuthService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public  ResponseEntity<BookAuth> getBookById(@PathVariable("id") Long id)
    {
        BookAuth bookAuth=bookAuthService.findBookById(id);
        return new ResponseEntity<>(bookAuth,HttpStatus.OK);
    }

}
