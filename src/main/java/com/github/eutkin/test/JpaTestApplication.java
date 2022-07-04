package com.github.eutkin.test;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.repository.AuthorRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaTestApplication implements ApplicationRunner {

    private final AuthorRepository repository;

    public JpaTestApplication(AuthorRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaTestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        final Author author = this.repository.find(args.getOptionValues("author").get(0));
        System.out.println(author);
    }
}
