package com.zup.library.service.mappers;

import com.zup.library.models.Book;
import com.zup.library.controllers.book.dtos.BookResponseDTO;
import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static <BookResponseDTO, Book> BookResponseDTO forResponse(Book book) {
        BookResponseDTO dto = new BookResponseDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setDescription(book.getDescription());
        dto.setEndUsers(EndUserMapper.forUserResponse(book.getConsumers()));
        return dto;
    }

    public static <BookResponseDTO> List<BookResponseDTO> forResponse(List<Book> books) {
        return books.stream().map(BookMapper::forResponse).collect(Collectors.toList());
    }
}