package miu.edu.cse.postgresazuredemo.repository;


import miu.edu.cse.postgresazuredemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
