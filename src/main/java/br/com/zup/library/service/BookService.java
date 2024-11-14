package com.example.library.service;

import com.example.library.dto.BookRegisterDTO;
import com.example.library.dto.BookUpdateDTO;
import com.example.library.dto.BookResponseDTO;

import java.util.List;

public interface BookService {
    void addBook(BookRegisterDTO bookRegisterDTO);
    void updateBook(String bookId, BookUpdateDTO bookUpdateDTO);
    List<BookResponseDTO> getAllBooks();
    void deleteBook(String bookId);

    List<com.example.library.dto.BookResponseDTO> getAll();

    void update(String id, com.example.library.dto.BookUpdateDTO updateDTO);

    void delete(String id);

    void save(com.example.library.dto.BookRegisterDTO registerDTO);
}