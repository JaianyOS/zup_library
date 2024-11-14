package com.example.library.controllers;

import com.example.library.dto.BookRegisterDTO;
import com.example.library.dto.BookUpdateDTO;
import com.example.library.dto.BookResponseDTO;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookResponseDTO> getAllBooks() {
        return bookService.getAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('AUTHOR')")
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook(@RequestBody @Valid BookRegisterDTO registerDTO) {
        bookService.save(registerDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable String id, @RequestBody @Valid BookUpdateDTO updateDTO) {
        try {
            bookService.update(id, updateDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", e.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable String id) {
        try {
            bookService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", e.getMessage()));
        }
    }
}