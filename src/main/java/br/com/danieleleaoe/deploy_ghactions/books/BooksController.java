package br.com.danieleleaoe.deploy_ghactions.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {
    
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/")
    public List<Book> list() {
        return this.booksRepository.findAll();   
    }

    @PostMapping("/")
    public Book create(@RequestBody Book book) {
        return this.booksRepository.save(book);    }


}
