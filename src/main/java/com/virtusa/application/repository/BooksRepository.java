package com.virtusa.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.application.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

	public List<Books> findByGenre(String genre);
}
