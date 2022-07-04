package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;
import org.springframework.lang.Nullable;

public interface AuthorRepository {

    @Nullable
    Author find(String name);
}
