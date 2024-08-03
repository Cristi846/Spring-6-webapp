package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

import java.util.Iterator;

public interface BookService {

    Iterable<Book> findAll();
}
