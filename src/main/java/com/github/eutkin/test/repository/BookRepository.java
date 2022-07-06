package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findBooksByAuthor(Author author);
}
