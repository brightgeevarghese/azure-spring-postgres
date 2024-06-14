package miu.edu.cse.postgresazuredemo.service;

import miu.edu.cse.postgresazuredemo.dto.BookRequestDto;
import miu.edu.cse.postgresazuredemo.dto.BookResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<List<BookResponseDto>> addAllBooks(List<BookRequestDto> bookRequestDtos);
    Page<BookResponseDto> findAll(int pageNumber, int pageSize, String direction, String sortBy);
}
