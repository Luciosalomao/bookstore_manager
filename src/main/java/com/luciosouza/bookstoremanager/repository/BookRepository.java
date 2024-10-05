package com.luciosouza.bookstoremanager.repository;
import com.luciosouza.bookstoremanager.entity;
import com.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
