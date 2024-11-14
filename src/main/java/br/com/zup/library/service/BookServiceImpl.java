package com.zup.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.zup.library.repositories.BookRepository;
import com.zup.library.service.mappers.BookMapper;
import com.zup.library.controllers.book.dtos.BookResponseDTO;
import com.zup.library.models.Book;
import com.example.library.service.BookService

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;



    @Override
    public <BookResponseDTO, Book> BookResponseDTO getBookWithUsers(String bookId) {
        Book book = bookRepository.findByIdWithUsers(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return BookMapper.toBookResponse(book);
    }
}