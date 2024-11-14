package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Page<Book> findAll(Pageable pageable);

    @Query("SELECT b FROM Book b JOIN FETCH b.users WHERE b.id = :id")
    Optional<Book> findByIdWithUsers(@Param("id") String id);
}