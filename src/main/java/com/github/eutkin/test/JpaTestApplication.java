package com.github.eutkin.test;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.entity.Book;
import com.github.eutkin.test.repository.AuthorRepository;
import com.github.eutkin.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaTestApplication implements ApplicationRunner {

    private final AuthorRepository repository;
    private final BookRepository bookRepository;

    public JpaTestApplication(AuthorRepository repository, BookRepository bookRepository) {
        this.repository = repository;
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaTestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        final Author author = this.repository.findByName("A.С. Пушкин");
        final List<Book> books = this.bookRepository.findBooksByAuthor(author);
        System.out.println(author);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
