package ro.cognizant.coderun2023.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cognizant.coderun2023.exception.IdNotFoundException;
import ro.cognizant.coderun2023.model.BookAuth;
import ro.cognizant.coderun2023.repo.BookAuthRepo;

import java.util.List;
import java.util.Optional;

@Service
public class BookAuthService {

    private final BookAuthRepo bookAuthRepo;
    @Autowired//Constructor
    public BookAuthService(BookAuthRepo bookAuthRepo) {
        this.bookAuthRepo = bookAuthRepo;
    }

    public BookAuth addBooks(BookAuth bookAuths)
    {
        Optional<BookAuth> existingBookAuth =bookAuthRepo.findBybookName(bookAuths.getBookName());
        if(existingBookAuth.isPresent())
        {
          return   existingBookAuth.get();
        }
        else
        {
            return bookAuthRepo.save(bookAuths);
        }
    }

    public List<BookAuth> books()
    {
        return bookAuthRepo.findAll();
    }

    public BookAuth updateBook(BookAuth bookAuth)
    {
        return bookAuthRepo.save(bookAuth);
    }

    public BookAuth findBookById(Long id)
    {
        return bookAuthRepo.findById(id).orElseThrow(()->new IdNotFoundException("Book by id "+id+" not found!"));
    }
    public void deleteBookById(Long id)
    {
        bookAuthRepo.deleteById(id);
    }




}
